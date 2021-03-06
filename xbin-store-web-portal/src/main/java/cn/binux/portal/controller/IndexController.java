package cn.binux.portal.controller;

import cn.binux.constant.Const;
import cn.binux.portal.service.PortalContentService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by cynicism on 17/1/27.
 */
@Controller
public class IndexController {

    @Reference(version = Const.XBIN_STORE_PORTAL_VERSION)
    private PortalContentService portalContentService;

    @Value("${big_ad_index}")
    private long Big_AD_INDEX;


    @RequestMapping("/")
    public String index(Model model, HttpSession session) {


        return "index";
    }

    @RequestMapping("/index22")
    public String index2(Model model, HttpSession session) {

        return "index2";
    }

    @RequestMapping("/sideBar/popupLogin")
    public String popupLogin(Model model, HttpSession session) {

        return "popupLogin";
    }


    //[LString;{"buttonPositionTop":false,"buttonPositionLeft":false,"largeIcon":true,"assistantFirstStart":false,"showWarnings":true,"scriptVersion":1}
    @RequestMapping("/adguard-ajax-api/api")
    @ResponseBody
    public String adguard(Model model, HttpSession session) {

        return "[LString;{\"buttonPositionTop\":false,\"buttonPositionLeft\":false,\"largeIcon\":true,\"assistantFirstStart\":false,\"showWarnings\":true,\"scriptVersion\":1}";
    }
}
