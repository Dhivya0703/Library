package com.lib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
//defining class name as Table name  
@Table  
public class Books  
{  
//Defining book id as primary key  
@Id  
@Column  
private int bookid;  
@Column  
private String bookname;  
@Column  
private String genre;  
@Column  
private int quantity;  
public int getBookid()   
{  
return bookid;  
}  
public void setBookid(int bookid)   
{  
this.bookid = bookid;  
}  
public String getBookname()  
{  
return bookname;  
}  
public void setBookname(String bookname)   
{  
this.bookname = bookname;  
}  
public String getgenre()   
{  
return genre;  
}  
public void setgenre(String genre)   
{  
this.genre = genre;  
}  
public int getquantity()   
{  
return quantity;  
}  
public void setquantity(int quantity)   
{  
this.quantity = quantity;  
}  
}  