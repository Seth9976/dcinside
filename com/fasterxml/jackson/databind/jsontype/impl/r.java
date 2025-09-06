package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

public class r {
    protected Set a;
    protected static final String b = "org.springframework.";
    protected static final String c = "com.mchange.v2.c3p0.";
    protected static final Set d;
    private static final r e;

    static {
        HashSet hashSet0 = new HashSet();
        hashSet0.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet0.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet0.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet0.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet0.add("org.codehaus.groovy.runtime.ConvertedClosure");
        hashSet0.add("org.codehaus.groovy.runtime.MethodClosure");
        hashSet0.add("org.springframework.beans.factory.ObjectFactory");
        hashSet0.add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        hashSet0.add("org.apache.xalan.xsltc.trax.TemplatesImpl");
        hashSet0.add("com.sun.rowset.JdbcRowSetImpl");
        hashSet0.add("java.util.logging.FileHandler");
        hashSet0.add("java.rmi.server.UnicastRemoteObject");
        hashSet0.add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
        hashSet0.add("org.springframework.aop.config.MethodLocatingFactoryBean");
        hashSet0.add("org.springframework.beans.factory.config.BeanReferenceFactoryBean");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
        hashSet0.add("com.sun.org.apache.bcel.internal.util.ClassLoader");
        hashSet0.add("org.hibernate.jmx.StatisticsService");
        hashSet0.add("org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
        hashSet0.add("org.apache.ibatis.parsing.XPathParser");
        hashSet0.add("jodd.db.connection.DataSourceConnectionProvider");
        hashSet0.add("oracle.jdbc.connector.OracleManagedConnectionFactory");
        hashSet0.add("oracle.jdbc.rowset.OracleJDBCRowSet");
        hashSet0.add("org.slf4j.ext.EventData");
        hashSet0.add("flex.messaging.util.concurrent.AsynchBeansWorkManagerExecutor");
        hashSet0.add("com.sun.deploy.security.ruleset.DRSHelper");
        hashSet0.add("org.apache.axis2.jaxws.spi.handler.HandlerResolverImpl");
        hashSet0.add("org.jboss.util.propertyeditor.DocumentEditor");
        hashSet0.add("org.apache.openjpa.ee.RegistryManagedRuntime");
        hashSet0.add("org.apache.openjpa.ee.JNDIManagedRuntime");
        hashSet0.add("org.apache.openjpa.ee.WASRegistryManagedRuntime");
        hashSet0.add("org.apache.axis2.transport.jms.JMSOutTransportInfo");
        hashSet0.add("com.mysql.cj.jdbc.admin.MiniAdmin");
        hashSet0.add("ch.qos.logback.core.db.DriverManagerConnectionSource");
        hashSet0.add("org.jdom.transform.XSLTransformer");
        hashSet0.add("org.jdom2.transform.XSLTransformer");
        hashSet0.add("net.sf.ehcache.transaction.manager.DefaultTransactionManagerLookup");
        hashSet0.add("net.sf.ehcache.hibernate.EhcacheJtaTransactionManagerLookup");
        hashSet0.add("ch.qos.logback.core.db.JNDIConnectionSource");
        hashSet0.add("com.zaxxer.hikari.HikariConfig");
        hashSet0.add("com.zaxxer.hikari.HikariDataSource");
        hashSet0.add("org.apache.cxf.jaxrs.provider.XSLTJaxbProvider");
        hashSet0.add("org.apache.commons.configuration.JNDIConfiguration");
        hashSet0.add("org.apache.commons.configuration2.JNDIConfiguration");
        hashSet0.add("org.apache.xalan.lib.sql.JNDIConnectionPool");
        hashSet0.add("com.sun.org.apache.xalan.internal.lib.sql.JNDIConnectionPool");
        hashSet0.add("org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS");
        hashSet0.add("org.apache.commons.dbcp.datasources.PerUserPoolDataSource");
        hashSet0.add("org.apache.commons.dbcp.datasources.SharedPoolDataSource");
        hashSet0.add("com.p6spy.engine.spy.P6DataSource");
        hashSet0.add("org.apache.log4j.receivers.db.DriverManagerConnectionSource");
        hashSet0.add("org.apache.log4j.receivers.db.JNDIConnectionSource");
        hashSet0.add("net.sf.ehcache.transaction.manager.selector.GenericJndiSelector");
        hashSet0.add("net.sf.ehcache.transaction.manager.selector.GlassfishSelector");
        hashSet0.add("org.apache.xbean.propertyeditor.JndiConverter");
        hashSet0.add("org.apache.hadoop.shaded.com.zaxxer.hikari.HikariConfig");
        hashSet0.add("com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig");
        hashSet0.add("br.com.anteros.dbcp.AnterosDBCPConfig");
        hashSet0.add("br.com.anteros.dbcp.AnterosDBCPDataSource");
        hashSet0.add("javax.swing.JEditorPane");
        hashSet0.add("javax.swing.JTextPane");
        hashSet0.add("org.apache.shiro.realm.jndi.JndiRealmFactory");
        hashSet0.add("org.apache.shiro.jndi.JndiObjectFactory");
        hashSet0.add("org.apache.ignite.cache.jta.jndi.CacheJndiTmLookup");
        hashSet0.add("org.apache.ignite.cache.jta.jndi.CacheJndiTmFactory");
        hashSet0.add("org.quartz.utils.JNDIConnectionProvider");
        hashSet0.add("org.apache.aries.transaction.jms.internal.XaPooledConnectionFactory");
        hashSet0.add("org.apache.aries.transaction.jms.RecoverablePooledConnectionFactory");
        hashSet0.add("com.caucho.config.types.ResourceRef");
        hashSet0.add("org.aoju.bus.proxy.provider.RmiProvider");
        hashSet0.add("org.aoju.bus.proxy.provider.remoting.RmiProvider");
        hashSet0.add("org.apache.activemq.ActiveMQConnectionFactory");
        hashSet0.add("org.apache.activemq.ActiveMQXAConnectionFactory");
        hashSet0.add("org.apache.activemq.spring.ActiveMQConnectionFactory");
        hashSet0.add("org.apache.activemq.spring.ActiveMQXAConnectionFactory");
        hashSet0.add("org.apache.activemq.pool.JcaPooledConnectionFactory");
        hashSet0.add("org.apache.activemq.pool.PooledConnectionFactory");
        hashSet0.add("org.apache.activemq.pool.XaPooledConnectionFactory");
        hashSet0.add("org.apache.activemq.jms.pool.XaPooledConnectionFactory");
        hashSet0.add("org.apache.activemq.jms.pool.JcaPooledConnectionFactory");
        hashSet0.add("org.apache.commons.proxy.provider.remoting.RmiProvider");
        hashSet0.add("org.apache.commons.jelly.impl.Embedded");
        hashSet0.add("oadd.org.apache.xalan.lib.sql.JNDIConnectionPool");
        hashSet0.add("oadd.org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS");
        hashSet0.add("oadd.org.apache.commons.dbcp.datasources.PerUserPoolDataSource");
        hashSet0.add("oadd.org.apache.commons.dbcp.datasources.SharedPoolDataSource");
        hashSet0.add("oracle.jms.AQjmsQueueConnectionFactory");
        hashSet0.add("oracle.jms.AQjmsXATopicConnectionFactory");
        hashSet0.add("oracle.jms.AQjmsTopicConnectionFactory");
        hashSet0.add("oracle.jms.AQjmsXAQueueConnectionFactory");
        hashSet0.add("oracle.jms.AQjmsXAConnectionFactory");
        hashSet0.add("org.jsecurity.realm.jndi.JndiRealmFactory");
        hashSet0.add("com.pastdev.httpcomponents.configuration.JndiConfiguration");
        hashSet0.add("com.nqadmin.rowset.JdbcRowSetImpl");
        hashSet0.add("org.arrah.framework.rdbms.UpdatableJdbcRowsetImpl");
        hashSet0.add("org.apache.commons.dbcp2.datasources.PerUserPoolDataSource");
        hashSet0.add("org.apache.commons.dbcp2.datasources.SharedPoolDataSource");
        hashSet0.add("org.apache.commons.dbcp2.cpdsadapter.DriverAdapterCPDS");
        hashSet0.add("com.newrelic.agent.deps.ch.qos.logback.core.db.JNDIConnectionSource");
        hashSet0.add("com.newrelic.agent.deps.ch.qos.logback.core.db.DriverManagerConnectionSource");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp.datasources.PerUserPoolDataSource");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp2.cpdsadapter.DriverAdapterCPDS");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp2.datasources.PerUserPoolDataSource");
        hashSet0.add("org.apache.tomcat.dbcp.dbcp2.datasources.SharedPoolDataSource");
        hashSet0.add("com.oracle.wls.shaded.org.apache.xalan.lib.sql.JNDIConnectionPool");
        hashSet0.add("org.docx4j.org.apache.xalan.lib.sql.JNDIConnectionPool");
        r.d = DesugarCollections.unmodifiableSet(hashSet0);
        r.e = new r();
    }

    protected r() {
        this.a = r.d;
    }

    public static r a() {
        return r.e;
    }

    public void b(h h0, m m0, c c0) throws o {
        Class class0 = m0.g();
        String s = class0.getName();
        if(this.a.contains(s)) {
            h0.X0(c0, "Illegal type (%s) to deserialize: prevented for security reasons", new Object[]{s});
        }
        else if(!class0.isInterface()) {
            if(s.startsWith("org.springframework.")) {
                while(class0 != null && class0 != Object.class) {
                    String s1 = class0.getSimpleName();
                    if(!"AbstractPointcutAdvisor".equals(s1) && !"AbstractApplicationContext".equals(s1)) {
                        class0 = class0.getSuperclass();
                        continue;
                    }
                    h0.X0(c0, "Illegal type (%s) to deserialize: prevented for security reasons", new Object[]{s});
                    return;
                }
                return;
            }
            if(s.startsWith("com.mchange.v2.c3p0.") && s.endsWith("DataSource")) {
                h0.X0(c0, "Illegal type (%s) to deserialize: prevented for security reasons", new Object[]{s});
            }
        }
    }
}

