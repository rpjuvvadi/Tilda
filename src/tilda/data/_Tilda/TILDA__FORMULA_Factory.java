
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

public class TILDA__FORMULA_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(TILDA__FORMULA_Factory.class.getName());

   protected TILDA__FORMULA_Factory() { }

   public static final Class<TILDA__FORMULA> DATA_CLASS= TILDA__FORMULA.class;
   public static final String SCHEMA_LABEL = TextUtil.Print("TILDA", "");
   public static final String TABLENAME_LABEL = TextUtil.Print("FORMULA", "");
   public static final String SCHEMA_TABLENAME_LABEL = TextUtil.Print("TILDA.FORMULA", "");
   public static void getFullTableNameVar(Connection C, StringBuilder S) { C.getFullTableVar(S, "TILDA", "FORMULA"); }

   public static abstract class COLS {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.refnum -> TILDA.FORMULA."refnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.refnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.refnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongPrimitive          REFNUM     = new Type_LongPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "refnum"     , 0/*0*/, "The primary key for this record");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.location -> TILDA.FORMULA."location"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.location of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.location of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the primary table/view this formula is defined in.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        LOCATION   = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "location"   , 1/*1*/, "The name of the primary table/view this formula is defined in.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.location2 -> TILDA.FORMULA."location2"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.location2 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.location2 of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the secondary table/view (a derived view, a realized table), if appropriate.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        LOCATION2  = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "location2"  , 2/*2*/, "The name of the secondary table/view (a derived view, a realized table), if appropriate.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.name -> TILDA.FORMULA."name"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.name of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.name of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the formula/column.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        NAME       = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "name"       , 3/*3*/, "The name of the formula/column.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.type -> TILDA.FORMULA."type"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.type of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.type of type character(3)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>3</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The type of the formula/column value/outcome.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>String</B>&nbsp;&nbsp;</TD><TD>STR&nbsp;&nbsp;</TD><TD>String&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>String</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>1&nbsp;&nbsp;</TD><TD align="right"><B>Character</B>&nbsp;&nbsp;</TD><TD>CHR&nbsp;&nbsp;</TD><TD>Character&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Character</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>2&nbsp;&nbsp;</TD><TD align="right"><B>Boolean</B>&nbsp;&nbsp;</TD><TD>BOL&nbsp;&nbsp;</TD><TD>Boolean&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Boolean</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>3&nbsp;&nbsp;</TD><TD align="right"><B>Integer</B>&nbsp;&nbsp;</TD><TD>INT&nbsp;&nbsp;</TD><TD>Integer&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Integer</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>4&nbsp;&nbsp;</TD><TD align="right"><B>Long</B>&nbsp;&nbsp;</TD><TD>LNG&nbsp;&nbsp;</TD><TD>Long&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Long</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>5&nbsp;&nbsp;</TD><TD align="right"><B>Float</B>&nbsp;&nbsp;</TD><TD>FLT&nbsp;&nbsp;</TD><TD>Float&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Float</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>6&nbsp;&nbsp;</TD><TD align="right"><B>Double</B>&nbsp;&nbsp;</TD><TD>DBL&nbsp;&nbsp;</TD><TD>Double&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Double</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>7&nbsp;&nbsp;</TD><TD align="right"><B>Date</B>&nbsp;&nbsp;</TD><TD>DT&nbsp;&nbsp;</TD><TD>Date&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Date</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>8&nbsp;&nbsp;</TD><TD align="right"><B>DateTime</B>&nbsp;&nbsp;</TD><TD>DTM&nbsp;&nbsp;</TD><TD>DateTime&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>DateTime</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_StringPrimitive        TYPE       = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "type"       , 4/*4*/, "The type of the formula/column value/outcome.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.title -> TILDA.FORMULA."title"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.title of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.title of type varchar(128)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>128</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title of the formula/column.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        TITLE      = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "title"      , 5/*5*/, "The title of the formula/column.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.description -> TILDA.FORMULA."description"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.description of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.description of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>32000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The description of the formula/column.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        DESCRIPTION= new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "description", 6/*6*/, "The description of the formula/column.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.formula -> TILDA.FORMULA."formula"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.formula of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.formula of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>32000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The formula.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    FORMULA    = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "formula"    , 7/*7*/, "The formula.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.htmlDoc -> TILDA.FORMULA."htmlDoc"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.htmlDoc of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.htmlDoc of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>32000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Pre-rendered html fragment with the full documentation for this formula.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    HTMLDOC    = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "htmlDoc"    , 8/*8*/, "Pre-rendered html fragment with the full documentation for this formula.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.FORMULA.created -> TILDA.FORMULA."created"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.created of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.created of type timestamptz</TD></TR>

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
//   Field tilda.data.TILDA.FORMULA.lastUpdated -> TILDA.FORMULA."lastUpdated"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.lastUpdated of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.lastUpdated of type timestamptz</TD></TR>

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
//   Field tilda.data.TILDA.FORMULA.deleted -> TILDA.FORMULA."deleted"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.FORMULA.deleted of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.FORMULA.deleted of type timestamptz</TD></TR>

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
              tilda.data.Formula_Factory.init(C);
              __INITIALIZED = true;
            }
         }
     }
   private static class RecordProcessorInternal implements tilda.db.processors.RecordProcessor
     {
       public RecordProcessorInternal(Connection C, int Start)
         {
           _C = C;
           _L = new ArrayListResults<tilda.data.Formula_Data>(Start);
         }
       public RecordProcessorInternal(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.Formula_Data> OP)
         {
           _C = C;
           _OP = OP;
         }
       protected Connection _C = null;
       protected tilda.db.processors.ObjectProcessor<tilda.data.Formula_Data> _OP;
       protected ArrayListResults<tilda.data.Formula_Data> _L = null;
       public void    Start  () { }
       public void    End    (boolean HasMore, int Max) { if (_OP == null) _L.wrapup(HasMore, Max); }
       public boolean Process(int Index, java.sql.ResultSet RS) throws Exception
        {
          tilda.data.Formula_Data Obj = new tilda.data.Formula_Data();
          boolean OK = ((tilda.data._Tilda.TILDA__FORMULA)Obj).Init(_C, RS);
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

   private static final void ReadMany(Connection C, int LookupId, tilda.db.processors.RecordProcessor RP, tilda.data._Tilda.TILDA__FORMULA Obj, Object ExtraParams, int Start, int Size) throws Exception
     {
       long T0 = System.nanoTime();
       StringBuilder S = new StringBuilder(1024);
       S.append("select ");
       S.append(" "); C.getFullColumnVar(S, "TILDA", "FORMULA", "refnum");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "location");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "location2");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "name");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "type");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "title");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "description");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "formula");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "htmlDoc");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "created");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "lastUpdated");
       S.append(", "); C.getFullColumnVar(S, "TILDA", "FORMULA", "deleted");
       S.append(" from "); C.getFullTableVar(S, "TILDA", "FORMULA");
       switch (LookupId)
        {
          case -7:
             String clause = ((SelectQuery)ExtraParams).getWhereClause();
             if (TextUtil.isNullOrEmpty(clause) == false) S.append(clause);
             break;
          case -666: break;
          default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot create where clause.");
        }

       
       String Q = S.toString() + C.getSelectLimitClause(Start, Size+1);
       S.setLength(0);
       S = null;
       QueryDetails.setLastQuery(SCHEMA_TABLENAME_LABEL, Q);
       QueryDetails.logQuery("TILDA.FORMULA", Q, null);
       java.sql.PreparedStatement PS=null;
       int count = 0;
       try
        {
          PS = C.prepareStatement(Q);
          switch (LookupId)
           {
             case -7:
                break;
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
          tilda.data._Tilda.TILDA__1_0.HandleFinally(PS, T0, TILDA__FORMULA_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, null);
          PS = null;
        }

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 Creates a new object in memory, which you can subsequently {@link #Write()} to the data store.
 current object to the destination. 
 @param location    (max size 64) The name of the primary table/view this formula is defined in.
 @param location2   (max size 64) The name of the secondary table/view (a derived view, a realized table), if appropriate.
 @param name        (max size 64) The name of the formula/column.
 @param type        (max size 3) The type of the formula/column value/outcome.
 @param title       (max size 128) The title of the formula/column.
 @param description (max size 32000) The description of the formula/column.
*/
   static public tilda.data.Formula_Data Create(String location, String location2, String name, String type, String title, String description) throws Exception
     {
       tilda.data._Tilda.TILDA__FORMULA Obj = new tilda.data.Formula_Data();
       Obj.initForCreate();


       // Auto PK
       Obj.setRefnum(tilda.db.KeysManager.getKey("TILDA.FORMULA"));

       // Explicit setters
       Obj.setLocation   (location   );
       Obj.setLocation2  (location2  );
       Obj.setName       (name       );
       Obj.setType       (type       );
       Obj.setTitle      (title      );
       Obj.setDescription(description);

       // Default Create-time setters
       Obj.setCreatedNow       ();
       Obj.setLastUpdatedNow   ();

       return (tilda.data.Formula_Data) Obj;
     }

   static public tilda.data.Formula_Data Create(Map<String, String> Values, List<StringStringPair> Errors)
   throws Exception
     {
       int IncomingErrors = Errors.size();

       Long        _refnum      =                       ParseUtil.parseLong("refnum"     , true , Values.get("refnum"     ), Errors );
       String        _location    =                       ParseUtil.parseString("location"   , true , Values.get("location"   ), Errors );
       String        _location2   =                       ParseUtil.parseString("location2"  , true , Values.get("location2"  ), Errors );
       String        _name        =                       ParseUtil.parseString("name"       , true , Values.get("name"       ), Errors );
       String        _type        =                       ParseUtil.parseString("type"       , true , Values.get("type"       ), Errors );
       String        _title       =                       ParseUtil.parseString("title"      , true , Values.get("title"      ), Errors );
       String        _description =                       ParseUtil.parseString("description", true , Values.get("description"), Errors );
       String        _formula     =                       ParseUtil.parseString("formula"    , false, Values.get("formula"    ), Errors );
       String        _htmlDoc     =                       ParseUtil.parseString("htmlDoc"    , false, Values.get("htmlDoc"    ), Errors );

       if (IncomingErrors != Errors.size())
        return null;

      tilda.data.Formula_Data Obj = tilda.data.Formula_Factory.Create(_location, _location2, _name, _type, _title, _description);

      if (_refnum     != null) Obj.setRefnum     (_refnum     );
      if (_formula    != null) Obj.setFormula    (_formula    );
      if (_htmlDoc    != null) Obj.setHtmlDoc    (_htmlDoc    );

      return Obj;
     }

   static public tilda.data.Formula_Data LookupByPrimaryKey(long refnum) throws Exception
     {
       tilda.data._Tilda.TILDA__FORMULA Obj = new tilda.data.Formula_Data();
       Obj.initForLookup(0);

       Obj.setRefnum     (refnum     ); Obj.__Saved_refnum      = Obj._refnum     ;

       return (tilda.data.Formula_Data) Obj;
     }

   static public tilda.data.Formula_Data LookupByFormula(String location, String name) throws Exception
     {
       tilda.data._Tilda.TILDA__FORMULA Obj = new tilda.data.Formula_Data();
       Obj.initForLookup(1);

       Obj.setLocation   (location   ); 
       Obj.setName       (name       ); 

       return (tilda.data.Formula_Data) Obj;
     }

   public static SelectQuery newSelectQuery(Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, true); }
   public static SelectQuery newWhereQuery (Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, false); }
   public static ListResults<tilda.data.Formula_Data> runSelect(Connection C, SelectQuery Q, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, Start);
       ReadMany(C, -7, RPI, null, Q, Start, Size);
       return RPI._L;
     }
   public static void runSelect(Connection C, SelectQuery Q, tilda.db.processors.ObjectProcessor<tilda.data.Formula_Data> OP, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       ReadMany(C, -7, RPI, null, Q, Start, Size);
     }
   public static UpdateQuery newUpdateQuery(Connection C) throws Exception { return new UpdateQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }
   public static DeleteQuery newDeleteQuery(Connection C) throws Exception { return new DeleteQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }

 }
