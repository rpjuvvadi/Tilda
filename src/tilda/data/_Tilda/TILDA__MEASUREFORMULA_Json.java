
package tilda.data._Tilda;

import java.io.*;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tilda.db.*;
import tilda.enums.*;
import tilda.performance.*;
import tilda.utils.*;

import com.google.gson.annotations.SerializedName;


public class TILDA__MEASUREFORMULA_Json
 {
   static final Logger             LOG                = LogManager.getLogger(TILDA__MEASUREFORMULA_Json.class.getName());

   protected TILDA__MEASUREFORMULA_Json() { }

   /*@formatter:off*/
   @SerializedName("measureRefnum") public Long  _measureRefnum;
   @SerializedName("formulaRefnum") public Long  _formulaRefnum;
   /*@formatter:on*/

   public tilda.data.MeasureFormula_Data Write(Connection C) throws Exception
    {
      if (_measureRefnum == null)
       throw new Exception("Incoming value for 'tilda.data.TILDA.MEASUREFORMULA.measureRefnum' was null or empty. It's not nullable in the model.\n"+toString());
      if (_formulaRefnum == null)
       throw new Exception("Incoming value for 'tilda.data.TILDA.MEASUREFORMULA.formulaRefnum' was null or empty. It's not nullable in the model.\n"+toString());

      tilda.data.MeasureFormula_Data Obj = tilda.data.MeasureFormula_Factory.Create(_measureRefnum, _formulaRefnum);
      Update(Obj);
      if (Obj.Write(C) == false)
       {
         Obj = tilda.data.MeasureFormula_Factory.LookupByPrimaryKey(_measureRefnum, _formulaRefnum);
         if (Obj.Read(C) == false)
          throw new Exception("Cannot create the tilda.data.TILDA.MEASUREFORMULA object.\n"+toString());
         LOG.debug("Nothing has changed in the object, so no update necessary.");

       }
      return Obj;
   }

   public void Update(tilda.data.MeasureFormula_Data Obj) throws Exception
    {
      if (_measureRefnum!= null) Obj.setMeasureRefnum(_measureRefnum);
      if (_formulaRefnum!= null) Obj.setFormulaRefnum(_formulaRefnum);
    }

   public String toString()
    {
      return
             "measureRefnum"+ (_measureRefnum == null ? ": NULL" : ": " + _measureRefnum)
         + "; formulaRefnum"+ (_formulaRefnum == null ? ": NULL" : ": " + _formulaRefnum)
         + ";";
    }

 }
