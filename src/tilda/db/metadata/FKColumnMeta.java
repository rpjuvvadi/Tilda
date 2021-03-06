package tilda.db.metadata;

import java.sql.ResultSet;

public class FKColumnMeta
  {
    protected FKColumnMeta(ResultSet RS)
    throws Exception
      {
        _Pos = RS.getInt("KEY_SEQ");
        _PKCol = RS.getString("PKCOLUMN_NAME");
        _FKCol = RS.getString("FKCOLUMN_NAME");
      }

    public final int        _Pos;
    public final String     _PKCol;
    public final String     _FKCol;

    public String toString()
      {
        return "Pos: "+_Pos+"; PKCol: "+_PKCol+"; FKCol: "+_FKCol+";";
      }
  }
