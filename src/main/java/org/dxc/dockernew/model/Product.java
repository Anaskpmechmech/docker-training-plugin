package org.dxc.dockernew.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private String productName;
	private String productCategory;
	private float price;
	private int quantity;

}
