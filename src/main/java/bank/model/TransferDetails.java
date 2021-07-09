package bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "TransferDetails")
public class TransferDetails
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@SequenceGenerator(name = "TransferDetails_seq", sequenceName = "TransferDetails_seq", allocationSize =1 )
		private Integer	id;
		
		private String	senderName;
		
		private Long		amount;
		
		private String	receiverName;

		public Integer getId()
			{
				return id;
			}

		public void setId(Integer id)
			{
				this.id = id;
			}

		public String getSenderName()
			{
				return senderName;
			}

		public void setSenderName(String senderName)
			{
				this.senderName = senderName;
			}

		public Long getAmount()
			{
				return amount;
			}

		public void setAmount(Long amount)
			{
				this.amount = amount;
			}

		public String getReceiverName()
			{
				return receiverName;
			}

		public void setReceiverName(String receiverName)
			{
				this.receiverName = receiverName;
			}

		@Override
		public String toString()
			{
				StringBuilder builder = new StringBuilder();
				builder.append("TransferDetails [id=");
				builder.append(id);
				builder.append(", senderName=");
				builder.append(senderName);
				builder.append(", amount=");
				builder.append(amount);
				builder.append(", receiverName=");
				builder.append(receiverName);
				builder.append("]");
				return builder.toString();
			}
		
		
		
	}
