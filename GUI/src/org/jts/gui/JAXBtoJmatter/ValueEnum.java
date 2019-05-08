/***********           LICENSE HEADER   *******************************
JAUS Tool Set
Copyright (c)  2010, United States Government
All rights reserved.

Redistribution and use in source and binary forms, with or without 
modification, are permitted provided that the following conditions are met:

       Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

       Redistributions in binary form must reproduce the above copyright 
notice, this list of conditions and the following disclaimer in the 
documentation and/or other materials provided with the distribution.

       Neither the name of the United States Government nor the names of 
its contributors may be used to endorse or promote products derived from 
this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
*********************  END OF LICENSE ***********************************/

package org.jts.gui.JAXBtoJmatter;

import org.jts.gui.importJSIDL.ImportMessages;

import com.u2d.app.Context;
import com.u2d.type.atom.IntEO;

// This class converts a JAXB ValueEnum to a JMatter ValueEnum
public class ValueEnum
{
	public static Object getStored( Object jaxbObject, Long generatedId )
	{
		org.jts.gui.util.QueryBuilder builder = new org.jts.gui.util.QueryBuilder();
		builder.setTableName( "ValueEnum" );
		builder.addArg( "enumIndex", new IntEO((int) ((org.jts.jsidl.binding.ValueEnum)jaxbObject).getEnumIndex()) );
		builder.addArg( "enumConstant", ((org.jts.jsidl.binding.ValueEnum)jaxbObject).getEnumConst() );
		
		return builder.getStored( jaxbObject, generatedId );
	}

	// This static method does the conversion from JAXB Binding to JMatter object 
	public static com.u2d.generated.ValueEnum lookupOrCreate( org.jts.jsidl.binding.ValueEnum jxValueEnum ) 
	{
		// Get and handle on a hibernate session
		com.u2d.persist.HBMSingleSession persistenceMechanism = (com.u2d.persist.HBMSingleSession) Context.getInstance().getPersistenceMechanism(); 
				
		// Get result of our query
		com.u2d.generated.ValueEnum jmValueEnum = (com.u2d.generated.ValueEnum)getStored( jxValueEnum, null );
    
		// if the jmValueEnum object is null, we will create it and add it to the db
		if(jmValueEnum == null)
		{
			jmValueEnum = new com.u2d.generated.ValueEnum();
			
			// set name
		      jmValueEnum.getName().setValue("MUST_RENAME");
			
			// Interpretation
		    if(jxValueEnum.getInterpretation() != null)
		    {
		    	String interpretation = jxValueEnum.getInterpretation().replaceAll("\\s\\s+ | \\n | \\r | \\t", " ").trim();;
//				if(interpretation.length() > 255)
//				{
//					String temp = interpretation.substring(0, 255);
//					jmValueEnum.getInterpretation().setValue(temp);
//
//					ImportMessages importMsgs = ImportMessages.getInstance();
//					importMsgs.add(ImportMessages.MessageType.WARNING, "ValueEnum interpretation attribute was truncated to: \"" + temp +"\"");
//				}
//				else
//				{
					jmValueEnum.getInterpretation().setValue(interpretation);
//				}
		    }
			
			// Enum Index
			jmValueEnum.getEnumIndex().setValue((int)jxValueEnum.getEnumIndex());
			
			// Enum Constant
			jmValueEnum.getEnumConstant().setValue(jxValueEnum.getEnumConst());
			
			// Saves the ValueEnum
			persistenceMechanism.save(jmValueEnum);
		}		

		jmValueEnum.firePropertyChange("ValueEnum", jmValueEnum, jmValueEnum);

		return jmValueEnum;
	}	
}
