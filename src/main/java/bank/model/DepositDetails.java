package bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DepositDetails")
public class DepositDetails
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@SequenceGenerator(name = "DepositDetails_seq", sequenceName = "DepositDetails_seq", allocationSize =1 )
		private Integer	id;
		
		private String	username;
		
		private Long	depositAmount;

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

		public Long getDepositAmount()
			{
				return depositAmount;
			}

		public void setDepositAmount(Long depositAmount)
			{
				this.depositAmount = depositAmount;
			}

		@Override
		public String toString()
			{
				StringBuilder builder = new StringBuilder();
				builder.append("DepositDetails [id=");
				builder.append(id);
				builder.append(", username=");
				builder.append(username);
				builder.append(", depositAmount=");
				builder.append(depositAmount);
				builder.append("]");
				return builder.toString();
			}
		
		
		
		
	}