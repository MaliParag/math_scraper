package com.symbolScraper.annotations.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter(AccessLevel.PUBLIC)
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class BoundingBox {
	
	Float left, top, right, bottom;
}
