
package org.jboss.as.quickstarts.kitchensink.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.7
 * Thu Apr 15 17:26:07 CEST 2021
 * Generated source version: 3.3.7
 */

@XmlRootElement(name = "createMember", namespace = "http://ws.kitchensink.quickstarts.as.jboss.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMember", namespace = "http://ws.kitchensink.quickstarts.as.jboss.org/")

public class CreateMember {

    @XmlElement(name = "arg0")
    private org.jboss.as.quickstarts.kitchensink.model.Member arg0;

    public org.jboss.as.quickstarts.kitchensink.model.Member getArg0() {
        return this.arg0;
    }

    public void setArg0(org.jboss.as.quickstarts.kitchensink.model.Member newArg0)  {
        this.arg0 = newArg0;
    }

}

