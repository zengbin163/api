package com.chihuo.uid.component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UidComponent {

	@RequestMapping("/uid/getUID")
	public long getUID();

	@RequestMapping("/uid/parseUID")
	public String parseUID(@RequestParam("uid") long uid);

}
