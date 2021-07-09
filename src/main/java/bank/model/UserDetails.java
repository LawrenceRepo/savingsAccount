package bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@SequenceGenerator(name = "UserDetails_seq", sequenceName = "UserDetails_seq", allocationSize =1 )
		private Integer	id;
		
		private String	username;
		
		private String	email;
		
		private String	firstName;
		
		private String	lastName;

		public Integer getId()
			{
				return id;
			}

		public void setId(Integer id)
			{
				this.id = id;
			}

		public String getUsername()
			{
				return username;
			}

		public void setUsername(String username)
			{
				this.username = username;
			}

		public String getEmail()
			{
				return email;
			}

		public void setEmail(String email)
			{
				this.email = email;
			}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		@Override
		public String toString()
			{
				StringBuilder builder = new StringBuilder();
				builder.append("UserDetails [id=");
				builder.append(id);
				builder.append(", username=");
				builder.append(username);
				builder.append(", email=");
				builder.append(email);
				builder.append(", firstName=");
				builder.append(firstName);
				builder.append(", lastName=");
				builder.append(lastName);
				builder.append("]");
				return builder.toString();
			}
		
		
		
	}
