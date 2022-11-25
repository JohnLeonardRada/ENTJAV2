ne">EntityKey</A>&nbsp;keyToLoad,
     <A HREF="../../../../../org/hibernate/event/LoadEventListener.LoadType.html" title="class in org.hibernate.event">LoadEventListener.LoadType</A>&nbsp;options)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Perfoms the load of an entity.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A></CODE></FONT></TD>
<TD><CODE><B>DefaultLoadEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultLoadEventListener.html#loadFromDatasource(org.hibernate.event.LoadEvent, org.hibernate.persister.entity.EntityPersister, org.hibernate.engine.EntityKey, org.hibernate.event.LoadEventListener.LoadType)">loadFromDatasource</A></B>(<A HREF="../../../../../org/hibernate/event/LoadEvent.html" title="class in org.hibernate.event">LoadEvent</A>&nbsp;event,
                   <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                   <A HREF="../../../../../org/hibernate/engine/EntityKey.html" title="class in org.hibernate.engine">EntityKey</A>&nbsp;keyToLoad,
                   <A HREF="../../../../../org/hibernate/event/LoadEventListener.LoadType.html" title="class in org.hibernate.event">LoadEventListener.LoadType</A>&nbsp;options)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Performs the process of loading an entity from the configured
 underlying datasource.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A></CODE></FONT></TD>
<TD><CODE><B>DefaultLoadEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultLoadEventListener.html#loadFromSecondLevelCache(org.hibernate.event.LoadEvent, org.hibernate.persister.entity.EntityPersister, org.hibernate.event.LoadEventListener.LoadType)">loadFromSecondLevelCache</A></B>(<A HREF="../../../../../org/hibernate/event/LoadEvent.html" title="class in org.hibernate.event">LoadEvent</A>&nbsp;event,
                         <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                         <A HREF="../../../../../org/hibernate/event/LoadEventListener.LoadType.html" title="class in org.hibernate.event">LoadEventListener.LoadType</A>&nbsp;options)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Attempts to load the entity from the second-level cache.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A></CODE></FONT></TD>
<TD><CODE><B>DefaultLoadEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultLoadEventListener.html#lockAndLoad(org.hibernate.event.LoadEvent, org.hibernate.persister.entity.EntityPersister, org.hibernate.engine.EntityKey, org.hibernate.event.LoadEventListener.LoadType, org.hibernate.engine.SessionImplementor)">lockAndLoad</A></B>(<A HREF="../../../../../org/hibernate/event/LoadEvent.html" title="class in org.hibernate.event">LoadEvent</A>&nbsp;event,
            <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
            <A HREF="../../../../../org/hibernate/engine/EntityKey.html" title="class in org.hibernate.engine">EntityKey</A>&nbsp;keyToLoad,
            <A HREF="../../../../../org/hibernate/event/LoadEventListener.LoadType.html" title="class in org.hibernate.event">LoadEventListener.LoadType</A>&nbsp;options,
            <A HREF="../../../../../org/hibernate/engine/SessionImplementor.html" title="interface in org.hibernate.engine">SessionImplementor</A>&nbsp;source)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;If the class to be loaded has been configured with a cache, then lock
 given id in that cache and then perform the load.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A></CODE></FONT></TD>
<TD><CODE><B>AbstractSaveEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/AbstractSaveEventListener.html#performSave(java.lang.Object, java.io.Serializable, org.hibernate.persister.entity.EntityPersister, boolean, java.lang.Object, org.hibernate.event.EventSource, boolean)">performSave</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id,
            <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
            boolean&nbsp;useIdentityColumn,
            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;anything,
            <A HREF="../../../../../org/hibernate/event/EventSource.html" title="interface in org.hibernate.event">EventSource</A>&nbsp;source,
            boolean&nbsp;requiresImmediateIdAccess)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ppepares the save call by checking the session caches for a pre-existing
 entity and performing any lifecycle callbacks.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A></CODE></FONT></TD>
<TD><CODE><B>AbstractSaveEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/AbstractSaveEventListener.html#performSaveOrReplicate(java.lang.Object, org.hibernate.engine.EntityKey, org.hibernate.persister.entity.EntityPersister, boolean, java.lang.Object, org.hibernate.event.EventSource, boolean)">performSaveOrReplicate</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
                       <A HREF="../../../../../org/hibernate/engine/EntityKey.html" title="class in org.hibernate.engine">EntityKey</A>&nbsp;key,
                       <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                       boolean&nbsp;useIdentityColumn,
                       <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;anything,
                       <A HREF="../../../../../org/hibernate/event/EventSource.html" title="interface in org.hibernate.event">EventSource</A>&nbsp;source,
                       boolean&nbsp;requiresImmediateIdAccess)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Performs all the actual work needed to save an entity (well to get the save moved to
 the execution queue).</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;void</CODE></FONT></TD>
<TD><CODE><B>DefaultSaveOrUpdateEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultSaveOrUpdateEventListener.html#performUpdate(org.hibernate.event.SaveOrUpdateEvent, java.lang.Object, org.hibernate.persister.entity.EntityPersister)">performUpdate</A></B>(<A HREF="../../../../../org/hibernate/event/SaveOrUpdateEvent.html" title="class in org.hibernate.event">SaveOrUpdateEvent</A>&nbsp;event,
              <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
              <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A></CODE></FONT></TD>
<TD><CODE><B>DefaultLoadEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultLoadEventListener.html#proxyOrLoad(org.hibernate.event.LoadEvent, org.hibernate.persister.entity.EntityPersister, org.hibernate.engine.EntityKey, org.hibernate.event.LoadEventListener.LoadType)">proxyOrLoad</A></B>(<A HREF="../../../../../org/hibernate/event/LoadEvent.html" title="class in org.hibernate.event">LoadEvent</A>&nbsp;event,
            <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
            <A HREF="../../../../../org/hibernate/engine/EntityKey.html" title="class in org.hibernate.engine">EntityKey</A>&nbsp;keyToLoad,
            <A HREF="../../../../../org/hibernate/event/LoadEventListener.LoadType.html" title="class in org.hibernate.event">LoadEventListener.LoadType</A>&nbsp;options)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Based on configured options, will either return a pre-existing proxy,
 generate a new proxy, or perform an actual load.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="../../../../../org/hibernate/engine/EntityEntry.html" title="class in org.hibernate.engine">EntityEntry</A></CODE></FONT></TD>
<TD><CODE><B>AbstractReassociateEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/AbstractReassociateEventListener.html#reassociate(org.hibernate.event.AbstractEvent, java.lang.Object, java.io.Serializable, org.hibernate.persister.entity.EntityPersister)">reassociate</A></B>(<A HREF="../../../../../org/hibernate/event/AbstractEvent.html" title="class in org.hibernate.event">AbstractEvent</A>&nbsp;event,
            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;object,
            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id,
            <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Associates a given entity (either transient or associated with another session) to
 the given session.</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;boolean</CODE></FONT></TD>
<TD><CODE><B>DefaultReplicateEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultReplicateEventListener.html#substituteValuesIfNecessary(java.lang.Object, java.io.Serializable, java.lang.Object[], org.hibernate.persister.entity.EntityPersister, org.hibernate.engine.SessionImplementor)">substituteValuesIfNecessary</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
                            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id,
                            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>[]&nbsp;values,
                            <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                            <A HREF="../../../../../org/hibernate/engine/SessionImplementor.html" title="interface in org.hibernate.engine">SessionImplementor</A>&nbsp;source)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;boolean</CODE></FONT></TD>
<TD><CODE><B>AbstractSaveEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/AbstractSaveEventListener.html#substituteValuesIfNecessary(java.lang.Object, java.io.Serializable, java.lang.Object[], org.hibernate.persister.entity.EntityPersister, org.hibernate.engine.SessionImplementor)">substituteValuesIfNecessary</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
                            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id,
                            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>[]&nbsp;values,
                            <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                            <A HREF="../../../../../org/hibernate/engine/SessionImplementor.html" title="interface in org.hibernate.engine">SessionImplementor</A>&nbsp;source)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Perform any property value substitution that is necessary
 (interceptor callback, version initialization...)</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;void</CODE></FONT></TD>
<TD><CODE><B>AbstractSaveEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/AbstractSaveEventListener.html#validate(java.lang.Object, org.hibernate.persister.entity.EntityPersister, org.hibernate.event.EventSource)">validate</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
         <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
         <A HREF="../../../../../org/hibernate/event/EventSource.html" title="interface in org.hibernate.event">EventSource</A>&nbsp;source)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;void</CODE></FONT></TD>
<TD><CODE><B>DefaultFlushEntityEventListener.</B><B><A HREF="../../../../../org/hibernate/event/def/DefaultFlushEntityEventListener.html#validate(java.lang.Object, org.hibernate.persister.entity.EntityPersister, org.hibernate.engine.Status, org.hibernate.EntityMode)">validate</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;entity,
         <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
         <A HREF="../../../../../org/hibernate/engine/Status.html" title="class in org.hibernate.engine">Status</A>&nbsp;status,
         <A HREF="../../../../../org/hibernate/EntityMode.html" title="class in org.hibernate">EntityMode</A>&nbsp;entityMode)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
</TABLE>
&nbsp;
<P>
<A NAME="org.hibernate.hql.ast.tree"><!-- --></A>
<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
Uses of <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A> in <A HREF="../../../../../org/hibernate/hql/ast/tree/package-summary.html">org.hibernate.hql.ast.tree</A></FONT></TH>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Methods in <A HREF="../../../../../org/hibernate/hql/ast/tree/package-summary.html">org.hibernate.hql.ast.tree</A> that return <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></CODE></FONT></TD>
<TD><CODE><B>FromElement.</B><B><A HREF="../../../../../org/hibernate/hql/ast/tree/FromElement.html#getEntityPersister()">getEntityPersister</A></B>()</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Methods in <A HREF="../../../../../org/hibernate/hql/ast/tree/package-summary.html">org.hibernate.hql.ast.tree</A> with parameters of type <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;void</CODE></FONT></TD>
<TD><CODE><B>FromElement.</B><B><A HREF="../../../../../org/hibernate/hql/ast/tree/FromElement.html#initializeEntity(org.hibernate.hql.ast.tree.FromClause, java.lang.String, org.hibernate.persister.entity.EntityPersister, org.hibernate.type.EntityType, java.lang.String, java.lang.String)">initializeEntity</A></B>(<A HREF="../../../../../org/hibernate/hql/ast/tree/FromClause.html" title="class in org.hibernate.hql.ast.tree">FromClause</A>&nbsp;fromClause,
                 <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;className,
                 <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                 <A HREF="../../../../../org/hibernate/type/EntityType.html" title="class in org.hibernate.type">EntityType</A>&nbsp;type,
                 <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;classAlias,
                 <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;tableAlias)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
</TABLE>
&nbsp;
<P>
<A NAME="org.hibernate.hql.ast.util"><!-- --></A>
<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
Uses of <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A> in <A HREF="../../../../../org/hibernate/hql/ast/util/package-summary.html">org.hibernate.hql.ast.util</A></FONT></TH>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Methods in <A HREF="../../../../../org/hibernate/hql/ast/util/package-summary.html">org.hibernate.hql.ast.util</A> that return <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></CODE></FONT></TD>
<TD><CODE><B>SessionFactoryHelper.</B><B><A HREF="../../../../../org/hibernate/hql/ast/util/SessionFactoryHelper.html#requireClassPersister(java.lang.String)">requireClassPersister</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;name)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Locate the persister by class or entity name, requiring that such a persister
 exist.</TD>
</TR>
</TABLE>
&nbsp;
<P>
<A NAME="org.hibernate.id"><!-- --></A>
<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
Uses of <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A> in <A HREF="../../../../../org/hibernate/id/package-summary.html">org.hibernate.id</A></FONT></TH>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Subinterfaces of <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A> in <A HREF="../../../../../org/hibernate/id/package-summary.html">org.hibernate.id</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;interface</CODE></FONT></TD>
<TD><CODE><B><A HREF="../../../../../org/hibernate/id/PostInsertIdentityPersister.html" title="interface in org.hibernate.id">PostInsertIdentityPersister</A></B></CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A persister that may have an identity assigned by execution of 
 a SQL <tt>INSERT</tt>.</TD>
</TR>
</TABLE>
&nbsp;
<P>
<A NAME="org.hibernate.impl"><!-- --></A>
<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
Uses of <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A> in <A HREF="../../../../../org/hibernate/impl/package-summary.html">org.hibernate.impl</A></FONT></TH>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Methods in <A HREF="../../../../../org/hibernate/impl/package-summary.html">org.hibernate.impl</A> that return <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></CODE></FONT></TD>
<TD><CODE><B>SessionFactoryImpl.</B><B><A HREF="../../../../../org/hibernate/impl/SessionFactoryImpl.html#getEntityPersister(java.lang.String)">getEntityPersister</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;entityName)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></CODE></FONT></TD>
<TD><CODE><B>StatelessSessionImpl.</B><B><A HREF="../../../../../org/hibernate/impl/StatelessSessionImpl.html#getEntityPersister(java.lang.String, java.lang.Object)">getEntityPersister</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;entityName,
                   <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;object)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></CODE></FONT></TD>
<TD><CODE><B>SessionImpl.</B><B><A HREF="../../../../../org/hibernate/impl/SessionImpl.html#getEntityPersister(java.lang.String, java.lang.Object)">getEntityPersister</A></B>(<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;entityName,
                   <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;object)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Methods in <A HREF="../../../../../org/hibernate/impl/package-summary.html">org.hibernate.impl</A> with parameters of type <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A></CODE></FONT></TD>
<TD><CODE><B>SessionImpl.</B><B><A HREF="../../../../../org/hibernate/impl/SessionImpl.html#instantiate(org.hibernate.persister.entity.EntityPersister, java.io.Serializable)">instantiate</A></B>(<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
            <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;give the interceptor an opportunity to override the default instantiation</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;void</CODE></FONT></TD>
<TD><CODE><B>StatelessSessionImpl.</B><B><A HREF="../../../../../org/hibernate/impl/StatelessSessionImpl.html#registerInsertedKey(org.hibernate.persister.entity.EntityPersister, java.io.Serializable)">registerInsertedKey</A></B>(<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                    <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;boolean</CODE></FONT></TD>
<TD><CODE><B>StatelessSessionImpl.</B><B><A HREF="../../../../../org/hibernate/impl/StatelessSessionImpl.html#wasInsertedDuringTransaction(org.hibernate.persister.entity.EntityPersister, java.io.Serializable)">wasInsertedDuringTransaction</A></B>(<A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
                             <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;id)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TD>
</TR>
</TABLE>
&nbsp;
<P>
<A NAME="org.hibernate.loader"><!-- --></A>
<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
<TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
Uses of <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A> in <A HREF="../../../../../org/hibernate/loader/package-summary.html">org.hibernate.loader</A></FONT></TH>
</TR>
</TABLE>
&nbsp;
<P>

<TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
<TR BGCOLOR="#CCCCFF" CLASS="TableSubHeadingColor">
<TH ALIGN="left" COLSPAN="2">Methods in <A HREF="../../../../../org/hibernate/loader/package-summary.html">org.hibernate.loader</A> with parameters of type <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A></FONT></TH>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/util/List.html?is-external=true" title="class or interface in java.util">List</A></CODE></FONT></TD>
<TD><CODE><B>Loader.</B><B><A HREF="../../../../../org/hibernate/loader/Loader.html#loadEntity(org.hibernate.engine.SessionImplementor, java.lang.Object, java.lang.Object, org.hibernate.type.Type, org.hibernate.type.Type, org.hibernate.persister.entity.EntityPersister)">loadEntity</A></B>(<A HREF="../../../../../org/hibernate/engine/SessionImplementor.html" title="interface in org.hibernate.engine">SessionImplementor</A>&nbsp;session,
           <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;key,
           <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;index,
           <A HREF="../../../../../org/hibernate/type/Type.html" title="interface in org.hibernate.type">Type</A>&nbsp;keyType,
           <A HREF="../../../../../org/hibernate/type/Type.html" title="interface in org.hibernate.type">Type</A>&nbsp;indexType,
           <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Called by subclasses that load entities</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>protected &nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/util/List.html?is-external=true" title="class or interface in java.util">List</A></CODE></FONT></TD>
<TD><CODE><B>Loader.</B><B><A HREF="../../../../../org/hibernate/loader/Loader.html#loadEntity(org.hibernate.engine.SessionImplementor, java.lang.Object, org.hibernate.type.Type, java.lang.Object, java.lang.String, java.io.Serializable, org.hibernate.persister.entity.EntityPersister, org.hibernate.LockOptions)">loadEntity</A></B>(<A HREF="../../../../../org/hibernate/engine/SessionImplementor.html" title="interface in org.hibernate.engine">SessionImplementor</A>&nbsp;session,
           <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;id,
           <A HREF="../../../../../org/hibernate/type/Type.html" title="interface in org.hibernate.type">Type</A>&nbsp;identifierType,
           <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;optionalObject,
           <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">String</A>&nbsp;optionalEntityName,
           <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>&nbsp;optionalIdentifier,
           <A HREF="../../../../../org/hibernate/persister/entity/EntityPersister.html" title="interface in org.hibernate.persister.entity">EntityPersister</A>&nbsp;persister,
           <A HREF="../../../../../org/hibernate/LockOptions.html" title="class in org.hibernate">LockOptions</A>&nbsp;lockOptions)</CODE>

<BR>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Called by subclasses that load entities</TD>
</TR>
<TR BGCOLOR="white" CLASS="TableRowColor">
<TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
<CODE>&nbsp;<A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/util/List.html?is-external=true" title="class or interface in java.util">List</A></CODE></FONT></TD>
<TD><CODE><B>Loader.</B><B><A HREF="../../../../../org/hibernate/loader/Loader.html#loadEntityBatch(org.hibernate.engine.SessionImplementor, java.io.Serializable[], org.hibernate.type.Type, java.lang.Object, java.lang.String, java.io.Serializable, org.hibernate.persister.entity.EntityPersister, org.hibernate.LockOptions)">loadEntityBatch</A></B>(<A HREF="../../../../../org/hibernate/engine/SessionImplementor.html" title="interface in org.hibernate.engine">SessionImplementor</A>&nbsp;session,
                <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html?is-external=true" title="class or interface in java.io">Serializable</A>[]&nbsp;ids,
                <A HREF="../../../../../org/hibernate/type/Type.html" title="interface in org.hibernate.type">Type</A>&nbsp;idType,
                <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Object.html?is-external=true" title="class or interface in java.lang">Object</A>&nbsp;optionalObject,
                <A HREF="http://java.sun.com/j2se/1.5.0/docs/api/java/lang/String.html?is-external=true" title="class or interface in java.lang">Stri