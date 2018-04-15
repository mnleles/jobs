package br.com.vehicle.model.response;

import java.io.Serializable;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class Response implements Serializable
{
	private static final long serialVersionUID = 9147771433269650132L;
	private Integer statusCode;
	private String message;
}
