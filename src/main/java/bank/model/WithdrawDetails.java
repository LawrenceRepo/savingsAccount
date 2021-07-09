package bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WithdrawDetails")
public class WithdrawDetails
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@SequenceGenerator(name = "WithdrawDetails_seq", sequenceName = "WithdrawDetails_seq", allocationSize =1 )
		private Integer	id;
		
		private String	username;
		
		private Long		withdrawAmount;

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

		public Long getWithdrawAmount()
			{
				return withdrawAmount;
			}

		public void setWithdrawAmount(Long withdrawAmount)
			{
				this.withdrawAmount = withdrawAmount;
			}

		@Override
		public String toString()
			{
				StringBuilder builder = new StringBuilder();
				builder.append("WithdrawDetails [id=");
				builder.append(id);
				builder.append(", username=");
				builder.append(username);
				builder.append(", withdrawAmount=");
				builder.append(withdrawAmount);
				builder.append("]");
				return builder.toString();
			}
		
		
		
	}
