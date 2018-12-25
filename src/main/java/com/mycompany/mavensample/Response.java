/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensample;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Akshay
 */
@XmlRootElement
public class Response {
    @XmlElement
    private int id = 1234;
    @XmlElement
    private String msg = "";
    public Response(){
       // this.msg = msg;
    }
    public void setMsg(String msg){
    this.msg = msg;
    }
}
