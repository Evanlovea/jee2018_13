package controller;
import java.sql.*;
import java.io.*;
import com.opensymphony.xwork2.ActionSupport;

public class ExDemo extends ActionSupport {
  @Override public String execute() throws Exception{
    double num=Math.random();
    if(num<0.5) throw new SQLException("�Ҳ�����");
    else throw new IOException("�ļ��Ҳ���");
  }
}
