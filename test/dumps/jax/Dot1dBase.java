/*
 * This Java file has been generated by smidump 0.5.0. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id$
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the scalar group dot1dBase defined in BRIDGE-MIB.

    @version 1
    @author  smidump 0.5.0
    @see     AgentXGroup, AgentXScalars
 */

import java.util.Vector;
import java.util.Enumeration;
import jax.AgentXOID;
import jax.AgentXVarBind;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;
import jax.AgentXScalars;

public class Dot1dBase extends AgentXScalars
{

    private final static long[] Dot1dBaseOID = {1, 3, 6, 1, 2, 1, 17, 1};

    protected AgentXOID Dot1dBaseBridgeAddressOID;
    protected final static long[] Dot1dBaseBridgeAddressName = {1, 3, 6, 1, 2, 1, 17, 1, 1, 0};
    protected byte[] dot1dBaseBridgeAddress = new byte[6];
    protected AgentXOID Dot1dBaseNumPortsOID;
    protected final static long[] Dot1dBaseNumPortsName = {1, 3, 6, 1, 2, 1, 17, 1, 2, 0};
    protected int dot1dBaseNumPorts = 0;
    protected AgentXOID Dot1dBaseTypeOID;
    protected final static long[] Dot1dBaseTypeName = {1, 3, 6, 1, 2, 1, 17, 1, 3, 0};
    protected int dot1dBaseType = 0;
    public Dot1dBase()
    {
        oid = new AgentXOID(Dot1dBaseOID);
        data = new Vector();
        Dot1dBaseBridgeAddressOID = new AgentXOID(Dot1dBaseBridgeAddressName);
        data.addElement(Dot1dBaseBridgeAddressOID);
        Dot1dBaseNumPortsOID = new AgentXOID(Dot1dBaseNumPortsName);
        data.addElement(Dot1dBaseNumPortsOID);
        Dot1dBaseTypeOID = new AgentXOID(Dot1dBaseTypeName);
        data.addElement(Dot1dBaseTypeOID);
    }

    public byte[] get_dot1dBaseBridgeAddress()
    {
        return dot1dBaseBridgeAddress;
    }

    public int get_dot1dBaseNumPorts()
    {
        return dot1dBaseNumPorts;
    }

    public int get_dot1dBaseType()
    {
        return dot1dBaseType;
    }

    public AgentXVarBind getScalar(AgentXOID pos, AgentXOID oid)
    {
        if ((pos == null) || (pos.compareTo(oid) != 0))
            return new AgentXVarBind(oid, AgentXVarBind.NOSUCHOBJECT);
        else {
            if (pos == Dot1dBaseBridgeAddressOID)
                return new AgentXVarBind(oid, AgentXVarBind.OCTETSTRING, 
                                         get_dot1dBaseBridgeAddress());
            if (pos == Dot1dBaseNumPortsOID)
                return new AgentXVarBind(oid, AgentXVarBind.INTEGER, 
                                         get_dot1dBaseNumPorts());
            if (pos == Dot1dBaseTypeOID)
                return new AgentXVarBind(oid, AgentXVarBind.INTEGER, 
                                         get_dot1dBaseType());
        }
        return new AgentXVarBind(oid, AgentXVarBind.NOSUCHOBJECT);
    }

    public int setScalar(AgentXSetPhase phase, AgentXOID pos,
                         AgentXVarBind inVb)
    {
        if ((pos == null) || (pos.compareTo(inVb.getOID()) != 0))
            return AgentXResponsePDU.INCONSISTENT_NAME;
        else {
        }
        return AgentXResponsePDU.NOT_WRITABLE;
    }

    public AgentXVarBind getNextScalar(AgentXOID pos, AgentXOID oid)
    {
        if ((pos == null) || (pos.compareTo(oid) <= 0))
            return new AgentXVarBind(oid, AgentXVarBind.ENDOFMIBVIEW);
        else {
            if (pos == Dot1dBaseBridgeAddressOID)
                return new AgentXVarBind(pos, AgentXVarBind.OCTETSTRING, 
                                         get_dot1dBaseBridgeAddress());
            if (pos == Dot1dBaseNumPortsOID)
                return new AgentXVarBind(pos, AgentXVarBind.INTEGER, 
                                         get_dot1dBaseNumPorts());
            if (pos == Dot1dBaseTypeOID)
                return new AgentXVarBind(pos, AgentXVarBind.INTEGER, 
                                         get_dot1dBaseType());
        }
        return new AgentXVarBind(pos, AgentXVarBind.ENDOFMIBVIEW);
    }

}

