/*
 * This Java file has been generated by smidump 0.2.14. It
 * is intended to be edited by the application programmer and
 * to be used within a Java AgentX sub-agent environment.
 *
 * $Id$
 */

/**
    This class extends the Java AgentX (JAX) implementation of
    the scalar group snmpSet defined in SNMPv2-MIB.
 */

import java.util.Vector;
import java.util.Enumeration;
import jax.AgentXOID;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;

public class SnmpSetImpl extends SnmpSet
{

    public int get_snmpSetSerialNo()
    {
        return snmpSetSerialNo;
    }

    public int set_snmpSetSerialNo(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_snmpSetSerialNo = snmpSetSerialNo;
            snmpSetSerialNo = value;
            break;
        case AgentXSetPhase.UNDO:
            snmpSetSerialNo = undo_snmpSetSerialNo;
            break;
        case AgentXSetPhase.CLEANUP:
            undo_snmpSetSerialNo = -1; // TODO: better check!
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }

}

