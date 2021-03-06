
package tilda.data._Tilda;

import java.time.*;
import java.util.*;

import tilda.db.*;
import tilda.enums.*;
import tilda.types.*;
import tilda.utils.*;
import tilda.utils.pairs.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class TILDA__CONNECTION_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(TILDA__CONNECTION_Factory.class.getName());

   protected TILDA__CONNECTION_Factory() { }

   public static final Class<TILDA__CONNECTION> DATA_CLASS= TILDA__CONNECTION.class;
   public static final String SCHEMA_LABEL = TextUtil.Print("TILDA", "");
   public static final String TABLENAME_LABEL = TextUtil.Print("CONNECTION", "");
   public static final String SCHEMA_TABLENAME_LABEL = TextUtil.Print("TILDA.CONNECTION", "");
   public static void getFullTableNameVar(Connection C, StringBuilder S) { C.getFullTableVar(S, "TILDA", "CONNECTION"); }

   public static abstract class COLS {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.active -> TILDA.CONNECTION."active"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.active of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.active of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Status Flag</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_BooleanPrimitiveNull   ACTIVE     = new Type_BooleanPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "active"     , 0/*0*/, "Status Flag");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.id -> TILDA.CONNECTION."id"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.id of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.id of type character(15)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>15</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Connection ID</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        ID         = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "id"         , 1/*1*/, "Connection ID");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.driver -> TILDA.CONNECTION."driver"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.driver of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.driver of type varchar(100)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>100</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>DB Driver</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        DRIVER     = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "driver"     , 2/*2*/, "DB Driver");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.db -> TILDA.CONNECTION."db"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.db of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.db of type varchar(200)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>200</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>DB Url</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        DB         = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "db"         , 3/*3*/, "DB Url");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.user -> TILDA.CONNECTION."user"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.user of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.user of type varchar(30)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>30</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>DB User</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        USER       = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "user"       , 4/*4*/, "DB User");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.pswd -> TILDA.CONNECTION."pswd"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.pswd of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.pswd of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>DB Password</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        PSWD       = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "pswd"       , 5/*5*/, "DB Password");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.initial -> TILDA.CONNECTION."initial"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.initial of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.initial of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Minimum Connections</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_IntegerPrimitive       INITIAL    = new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "initial"    , 6/*6*/, "Minimum Connections");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.max -> TILDA.CONNECTION."max"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.max of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.max of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Maximum Connections</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_IntegerPrimitive       MAX        = new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "max"        , 7/*7*/, "Maximum Connections");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.schemas -> TILDA.CONNECTION."schemas"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.schemas of type List<String></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.schemas of type text[]</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>null</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Schemas</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringCollection       SCHEMAS    = new Type_StringCollection      (SCHEMA_LABEL, TABLENAME_LABEL, "schemas"    , 8/*8*/, "Schemas");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.created -> TILDA.CONNECTION."created"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.created of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.created of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was created.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>Creation</B>&nbsp;&nbsp;</TD><TD>NOW&nbsp;&nbsp;</TD><TD>Creation&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Creation time</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_DatetimePrimitive      CREATED    = new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "created"    , 9/*9*/, "The timestamp for when the record was created.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.lastUpdated -> TILDA.CONNECTION."lastUpdated"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.lastUpdated of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.lastUpdated of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was last updated.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>Update</B>&nbsp;&nbsp;</TD><TD>NOW&nbsp;&nbsp;</TD><TD>Update&nbsp;&nbsp;</TD><TD>ALWAYS&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Last updated time</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_DatetimePrimitive      LASTUPDATED= new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "lastUpdated", 10/*10*/, "The timestamp for when the record was last updated.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.CONNECTION.deleted -> TILDA.CONNECTION."deleted"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.CONNECTION.deleted of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.CONNECTION.deleted of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was deleted.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  DELETED    = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "deleted"    , 11/*11*/, "The timestamp for when the record was deleted.");
;
   }

   private static Boolean  __INITIALIZED = false;
   protected static void initObject(Connection C) throws Exception
     {
       if (__INITIALIZED == false)
        synchronized(__INITIALIZED)
         {
           if (__INITIALIZED == false)
            {
              tilda.data.Connection_Factory.init(C);
              __INITIALIZED = true;
            }
         }
     }
   private static class RecordProcessorInternal implements tilda.db.processors.RecordProcessor
     {
       public RecordProcessorInternal(Connection C, int Start)
         {
           _C = C;
           _L = new ArrayListResults<tilda.data.Connection_Data>(Start);
         }
       public RecordProcessorInternal(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.Connection_Data> OP)
         {
           _C = C;
           _OP = OP;
         }
       protected Connection _C = null;
       protected tilda.db.processors.ObjectProcessor<tilda.data.Connection_Data> _OP;
       protected ArrayListResults<tilda.data.Connection_Data> _L = null;
       public void    Start  () { }
       public void    End    (boolean HasMore, int Max) { if (_OP == null) _L.wrapup(HasMore, Max); }
       public boolean Process(int Index, java.sql.ResultSet RS) throws Exception
        {
          tilda.data.Connection_Data Obj = new tilda.data.Connection_Data();
          boolean OK = ((tilda.data._Tilda.TILDA__CONNECTION)Obj).Init(_C, RS);
          if (OK == true)
           {
             if (_OP == null)
              _L.add(Obj);
             else
              _OP.Process(Index, Obj);
           }
          return OK;
        }
     }

   private static final void ReadMany(Connection C, int LookupId, tilda.db.processors.RecordProcessor RP, tilda.data._Tilda.TILDA__CONNECTION Obj, Object ExtraParams, int Start, int Size) throws Exception
     {
       long T0 = System.nanoTime();
       StringBuilder S = new StringBuilder(1024);
       S.append("select ");
       S.append(" "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "active");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "id");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "driver");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "db");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "user");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "pswd");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "initial");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "max");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "schemas");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "created");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "lastUpdated");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "deleted");
       S.append(" from "); C.getFullTableVar(S, "TILDA", "CONNECTION");
       switch (LookupId)
        {
          case -7:
             String clause = ((SelectQuery)ExtraParams).getWhereClause();
             if (TextUtil.isNullOrEmpty(clause) == false) S.append(clause);
             break;
          case 1:
             S.append(" order by "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "id"); S.append(" ASC");
             break;
          case 2:
             S.append(" where ("); C.getFullColumnVar(S, "TILDA", "CONNECTION", "active"); S.append(" IS NOT false)");
             S.append(" order by "); C.getFullColumnVar(S, "TILDA", "CONNECTION", "id"); S.append(" ASC");
             break;
          case -666: break;
          default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot create where clause.");
        }

       
       String Q = S.toString() + C.getSelectLimitClause(Start, Size+1);
       S.setLength(0);
       S = null;
       QueryDetails.setLastQuery(SCHEMA_TABLENAME_LABEL, Q);
       QueryDetails.logQuery("TILDA.CONNECTION", Q, null);
       java.sql.PreparedStatement PS=null;
       List<java.sql.Array> AllocatedArrays = new ArrayList<java.sql.Array>();
       int count = 0;
       try
        {
          PS = C.prepareStatement(Q);
          switch (LookupId)
           {
             case -7:
                break;
             case 1: {
               break;
             }
             case 2: {
               break;
             }
             case -666: break;
             default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot prepare statement.");
           }


          count = JDBCHelper.Process(PS.executeQuery(), RP, Start, true, Size, true);
        }
       catch (java.sql.SQLException E)
        {
          tilda.data._Tilda.TILDA__1_0.HandleCatch(C, E, "selected");
        }
       finally
        {
          tilda.data._Tilda.TILDA__1_0.HandleFinally(PS, T0, TILDA__CONNECTION_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, AllocatedArrays);
          PS = null;
          AllocatedArrays = null;
        }

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 Creates a new object in memory, which you can subsequently {@link #Write()} to the data store.
 current object to the destination. 
 @param id          (max size 15) Connection ID
 @param driver      (max size 100) DB Driver
 @param db          (max size 200) DB Url
 @param user        (max size 30) DB User
 @param pswd        (max size 40) DB Password
 @param initial     Minimum Connections
 @param max         Maximum Connections
 @param schemas     Schemas
*/
   static public tilda.data.Connection_Data Create(String id, String driver, String db, String user, String pswd, int initial, int max, List<String> schemas) throws Exception
     {
       tilda.data._Tilda.TILDA__CONNECTION Obj = new tilda.data.Connection_Data();
       Obj.initForCreate();


       // Explicit setters
       Obj.setId         (id         );
       Obj.setDriver     (driver     );
       Obj.setDb         (db         );
       Obj.setUser       (user       );
       Obj.setPswd       (pswd       );
       Obj.setInitial    (initial    );
       Obj.setMax        (max        );
       Obj.setSchemas    (schemas    );

       // Default Create-time setters
       Obj.setCreatedNow       ();
       Obj.setLastUpdatedNow   ();

       return (tilda.data.Connection_Data) Obj;
     }

   static public tilda.data.Connection_Data Create(Map<String, String> Values, List<StringStringPair> Errors)
   throws Exception
     {
       int IncomingErrors = Errors.size();

       Boolean        _active      =                       ParseUtil.parseBoolean("active"     , false, Values.get("active"     ), Errors );
       String        _id          =                       ParseUtil.parseString("id"         , true , Values.get("id"         ), Errors );
       String        _driver      =                       ParseUtil.parseString("driver"     , true , Values.get("driver"     ), Errors );
       String        _db          =                       ParseUtil.parseString("db"         , true , Values.get("db"         ), Errors );
       String        _user        =                       ParseUtil.parseString("user"       , true , Values.get("user"       ), Errors );
       String        _pswd        =                       ParseUtil.parseString("pswd"       , true , Values.get("pswd"       ), Errors );
       Integer        _initial     =                       ParseUtil.parseInteger("initial"    , true , Values.get("initial"    ), Errors );
       Integer        _max         =                       ParseUtil.parseInteger("max"        , true , Values.get("max"        ), Errors );
       List<String>  _schemas     = CollectionUtil.toList(ParseUtil.parseString("schemas"    , true , Values.get("schemas"    ), "``", Errors));

       if (IncomingErrors != Errors.size())
        return null;

      tilda.data.Connection_Data Obj = tilda.data.Connection_Factory.Create(_id, _driver, _db, _user, _pswd, _initial, _max, _schemas);

      if (_active     != null) Obj.setActive     (_active     );

      return Obj;
     }

   static public tilda.data.Connection_Data LookupByPrimaryKey(String id) throws Exception
     {
       tilda.data._Tilda.TILDA__CONNECTION Obj = new tilda.data.Connection_Data();
       Obj.initForLookup(0);

       Obj.setId         (id         ); Obj.__Saved_id          = Obj._id         ;

       return (tilda.data.Connection_Data) Obj;
     }

   static public ListResults<tilda.data.Connection_Data> LookupWhereAllById(Connection C, int Start, int Size) throws Exception
     {
       tilda.data._Tilda.TILDA__CONNECTION Obj = new tilda.data.Connection_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, Start);
       ReadMany(C, 1, RPI, Obj, null, Start, Size);
       return RPI._L;
     }

   static public void LookupWhereAllById(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.Connection_Data> OP, int Start, int Size) throws Exception
     {
       tilda.data._Tilda.TILDA__CONNECTION Obj = new tilda.data.Connection_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       ReadMany(C, 1, RPI, Obj, null, Start, Size);
     }


   static public ListResults<tilda.data.Connection_Data> LookupWhereActive(Connection C, int Start, int Size) throws Exception
     {
       tilda.data._Tilda.TILDA__CONNECTION Obj = new tilda.data.Connection_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);


       RecordProcessorInternal RPI = new RecordProcessorInternal(C, Start);
       ReadMany(C, 2, RPI, Obj, null, Start, Size);
       return RPI._L;
     }


   public static SelectQuery newSelectQuery(Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, true); }
   public static SelectQuery newWhereQuery (Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, false); }
   public static ListResults<tilda.data.Connection_Data> runSelect(Connection C, SelectQuery Q, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, Start);
       ReadMany(C, -7, RPI, null, Q, Start, Size);
       return RPI._L;
     }
   public static void runSelect(Connection C, SelectQuery Q, tilda.db.processors.ObjectProcessor<tilda.data.Connection_Data> OP, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       ReadMany(C, -7, RPI, null, Q, Start, Size);
     }
   public static UpdateQuery newUpdateQuery(Connection C) throws Exception { return new UpdateQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }
   public static DeleteQuery newDeleteQuery(Connection C) throws Exception { return new DeleteQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }

 }
