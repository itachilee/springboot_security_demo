package com.reason.gsny.util;

import org.hibernate.HibernateException;
import org.hibernate.dialect.SQLServerDialect;

import java.sql.Types;

/**
 * Created by Administrator on 2019-04-30.
 */
public class SQLServerNativeDialect extends SQLServerDialect {
    public SQLServerNativeDialect() {
        super();
        registerColumnType(Types.VARCHAR, "nvarchar($l)");
        registerColumnType(Types.CLOB, "nvarchar(max)");
    }

    public String getTypeName(int code, int length, int precision, int scale) throws HibernateException {
        if(code != 2005) {
            return super.getTypeName(code, length, precision, scale);
        } else {
            return "ntext";
        }
    }
}
