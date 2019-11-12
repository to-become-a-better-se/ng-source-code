package jp.co.tbbs.ng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.tbbs.ng.service.UserInfoService;

@Controller
@RequestMapping("/pages")
public class WebController {

	@Autowired
	UserInfoService userInfo;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("msg","サンプルメッセージ！");
        model.addAttribute("list", userInfo.listUsers());
        return "pages/index";
    }

    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public String detail(Model model) {
    	String userId = (String)model.getAttribute("userId");

    	if(userId.equals("")) {
            return "redirect:pages/";
    	} else {
            model.addAttribute("userInfo", userInfo.userDetail(userId));
            return "pages/detail";
    	}

    }
}
