/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Calendar;

/**
 *
 * @author Przemo
 */
public class Players {
    private int id;
	private String FirstName;
	private String LastName;
	private Calendar Birthday;
	private String Country;
        
	public Players() {
	}

	public Players(int id) {
		this.id = id;
	}

	public Players(int id, String FirstName, String LastName,
			Calendar Birthday, String Country) {
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Birthday = Birthday;
		this.Country = Country;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
            if(FirstName!=null)
		this.FirstName = FirstName;
            else
                this.FirstName = "";
	}

	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
            if(LastName!=null)
		this.LastName = LastName;
            else
                this.LastName="";
	}

	public Calendar getBirthday() {
		return this.Birthday;
	}

	public void setBirthday(Calendar Birthday) {
		this.Birthday = Birthday;
	}

	public String getCountry() {
		return this.Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
}
