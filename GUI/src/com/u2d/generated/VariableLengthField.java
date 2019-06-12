/*
 * VariableLengthField.java
 *
 * This code has been auto-updated by JTS after it has been auto-generated by umlc
 * Created on Wed Oct 05 10:31:04 EDT 2011
 */

package com.u2d.generated;


import com.u2d.model.*;
import com.u2d.app.PersistenceMechanism;
import com.u2d.type.*;
import com.u2d.type.atom.*;
import com.u2d.type.composite.*;
import com.u2d.list.RelationalList;
import com.u2d.reflection.Fld;
import javax.persistence.Entity;
/** place holder for more imports **/


@Entity
public  class VariableLengthField extends SimpleField {

    
    /** Creates a new instance of VariableLengthField */
    public VariableLengthField() {
    }
    public Title title() { 
        StringBuffer text = new StringBuffer();
        text.append(name.title() + " [VariableLengthField]");
        return new Title(text.toString());
    }    
    


    // ******    name   ******
    private final StringEO name = new StringEO();
    public StringEO getName() { return name;}

    // ******    optional   ******
    private final BooleanEO optional = new BooleanEO();
    public BooleanEO getOptional() { return optional;}

    // ******    fieldFormat   ******
    private final DataFormat fieldFormat = new DataFormat();
    public DataFormat getFieldFormat() { return fieldFormat;}

    // ******    minSize   ******
    private final LongEO minSize = new LongEO();
    public LongEO getMinSize() { return minSize;}

    // ******    maxSize   ******
    private final LongEO maxSize = new LongEO();
    public LongEO getMaxSize() { return maxSize;}

    // ******    interpretation   ******
    private final TextEO interpretation = new TextEO();
    public TextEO getInterpretation() { return interpretation;}

   
 
/************** Uncomment the following as needed *****************************/
      public static String[] fieldOrder  = {"name", "optional", "fieldFormat", "minSize", "maxSize",       "interpretation", "referencingElements"};
public static String[] readOnly  = {"referencingElements"};
// ******    referencingElements   ******
   private final StringEO referencingElements = new StringEO("{Records, Arrays}");
   public StringEO getReferencingElements() { return referencingElements;}

      ;
//    public static String[] tabViews          = {"fieldname1", "fieldname2"};

      ;
//    public static String[] flattenIntoParent = {"fieldname1", "fieldname2"};

      ;
//    public static String[] identities = {"fieldname1", "fieldname2"};

//    public static String pluralName() { return "VariableLengthFields"; }
      /* Specify a color to represnt this class */
//    public static Color colorCode = new Color(0x2332);

      /* Use a different Icon for each instance. Change photoFieldName. */
//    private transient PhotoIconAssistant assistant = 
//                        new PhotoIconAssistant(this, photoFieldname);
//    public Icon iconLg() { return assistant.iconLg(); }
//    public Icon iconSm() { return assistant.iconSm(); }


      /* Specify the default search field for this class */
//    public static String defaultSearchPath = "";


      /* Specify a custom view for this class. 
//    public EView getMainView()
//    {
//       return new CustomVariableLengthFieldView(this);
//    }
/**********************/
/**@Cmd place holder**/        
}
