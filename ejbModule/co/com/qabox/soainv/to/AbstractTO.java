/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pbuitrag
 */

@XmlRootElement
public class AbstractTO  {
    
    private Integer id;
    private String name;
    private String desc;
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
