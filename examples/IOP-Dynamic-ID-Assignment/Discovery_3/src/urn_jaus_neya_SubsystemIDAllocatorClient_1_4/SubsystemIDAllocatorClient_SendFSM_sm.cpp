/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : SubsystemIDAllocatorClient_SendFSM_sm.sm
 */

#include "urn_jaus_neya_SubsystemIDAllocatorClient_1_4/Messages/MessageSet.h"
#include "urn_jaus_neya_SubsystemIDAllocatorClient_1_4/SubsystemIDAllocatorClient_SendFSM.h"
#include "include/urn_jaus_neya_SubsystemIDAllocatorClient_1_4/SubsystemIDAllocatorClient_SendFSM_sm.h"

using namespace statemap;

namespace urn_jaus_neya_SubsystemIDAllocatorClient_1_4
{
    // Static class declarations.
    SubsystemIDAllocatorClient_SendFSM_SM_Sending SubsystemIDAllocatorClient_SendFSM_SM::Sending("SubsystemIDAllocatorClient_SendFSM_SM::Sending", 0);
    SubsystemIDAllocatorClient_SendFSM_SM_Internally_Generated_State_DO_NOT_USE SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE("SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE", 1);

    void SubsystemIDAllocatorClient_SendFSMState::BroadcastGlobalTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void SubsystemIDAllocatorClient_SendFSMState::BroadcastLocalTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void SubsystemIDAllocatorClient_SendFSMState::GrantSubsystemIDTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void SubsystemIDAllocatorClient_SendFSMState::ReceiveTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void SubsystemIDAllocatorClient_SendFSMState::SendTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void SubsystemIDAllocatorClient_SendFSMState::Default(SubsystemIDAllocatorClient_SendFSMContext& context)
    {
        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Default"
                << std::endl;
        }

        throw (
            TransitionUndefinedException(
                context.getState().getName(),
                context.getTransition()));

        return;
    }

    void SubsystemIDAllocatorClient_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::BroadcastGlobalTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "LEAVING STATE   : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE"
            << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "ENTER TRANSITION: SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::BroadcastGlobalTransition()"
                << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "EXIT TRANSITION : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::BroadcastGlobalTransition()"
                << std::endl;
        }


        return;
    }

    void SubsystemIDAllocatorClient_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::BroadcastLocalTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "LEAVING STATE   : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE"
            << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "ENTER TRANSITION: SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::BroadcastLocalTransition()"
                << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "EXIT TRANSITION : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::BroadcastLocalTransition()"
                << std::endl;
        }


        return;
    }

    void SubsystemIDAllocatorClient_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::GrantSubsystemIDTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "LEAVING STATE   : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE"
            << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "ENTER TRANSITION: SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::GrantSubsystemIDTransition()"
                << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "EXIT TRANSITION : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::GrantSubsystemIDTransition()"
                << std::endl;
        }


        return;
    }

    void SubsystemIDAllocatorClient_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::ReceiveTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "LEAVING STATE   : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE"
            << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "ENTER TRANSITION: SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::ReceiveTransition()"
                << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "EXIT TRANSITION : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::ReceiveTransition()"
                << std::endl;
        }


        return;
    }

    void SubsystemIDAllocatorClient_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::SendTransition(SubsystemIDAllocatorClient_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "LEAVING STATE   : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE"
            << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "ENTER TRANSITION: SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::SendTransition()"
                << std::endl;
        }

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "EXIT TRANSITION : SubsystemIDAllocatorClient_SendFSM_SM::Internally_Generated_State_DO_NOT_USE::SendTransition()"
                << std::endl;
        }


        return;
    }
}

/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */
