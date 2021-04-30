FROM quay.io/wildfly/wildfly-centos7:22.0
COPY target/kitchensink.war /opt/wildfly/standalone/deployments 
RUN mv /opt/wildfly/standalone/configuration/standalone.xml /opt/wildfly/standalone/configuration/standalone-min.xml
COPY standalone-full.xml /opt/wildfly/standalone/configuration/standalone-full.xml
RUN ln -s /opt/wildfly/standalone/configuration/standalone-full.xml /opt/wildfly/standalone/configuration/standalone.xml
