package com.example.demo.controller;

import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.example.demo.entity.Database;
import com.example.demo.form.AppsForm;
import com.example.demo.repository.AppsRepository;
import com.example.demo.service.AppsService;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
// @RequestMapping("/kibidanrangit.pages.dev")
public class AppsController {
    //ログ用
    // private static final Logger logger = LoggerFactory.getLogger(AppsController.class);
    //DI対象
    @Autowired
    AppsService service;
    //form-backing beanの初期化
    @ModelAttribute
    public AppsForm setUpForm(){
        AppsForm form = new AppsForm();
        return form;
    }

    // @GetMapping("/top")
    // public String topView(){
    //     return "top";
    // }
    @GetMapping("/top")
    public String showTop(HttpServletRequest request, Model model) {
        // フラッシュ属性の取得
        Map<String, ?> flashAttributes = RequestContextUtils.getInputFlashMap(request);
        if (flashAttributes != null) {
            // フラッシュ属性から値を取り出してモデルに追加
            model.addAttribute("list", flashAttributes.get("list"));
        }

        return "top";
    }
    // @GetMapping("/syumireta")
    // public String syumiretaView(){
    //     return "syumireta";
    // }
    // @GetMapping("/shitsumon")
    // public String shitsumonView(){
    //     return "shitsumon";
    // }
    // @GetMapping("/kosodate")
    // public String kosodateView(){
    //     return "kosodate";
    // }
    // @GetMapping("/kensaaku")
    // public String kensaakuView(){
    //     return "kensaaku";
    // }
    // @GetMapping("/kekkon")
    // public String kekkonView(){
    //     return "kekkon";
    // }
    // @GetMapping("/hikaku")
    // public String hikakuView(){
    //     return "hikaku";
    // }

    @PostMapping("/search")
    public String searchFacility(AppsForm appsForm, AppsRepository appsRepository,
                                BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        if(!bindingResult.hasErrors()){
            String viewFacility = appsForm.getViewFacility();
            Iterable<Database> list = service.findByFacility(viewFacility);
            redirectAttributes.addFlashAttribute("list", list);
            // model.addAttribute("list", list);
            return "redirect:/top#chapter4";
            // return "top";
        }else{
            return "top";
        }

    }
    @PostMapping("/selectType")
    public String selectFacility(@ModelAttribute("AppsForm") AppsForm appsForm, AppsRepository appsRepository,
                                BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        if(!bindingResult.hasErrors()){
            String viewType = appsForm.getViewType();
            // logger.info("appsFormのviewTypeの値: {}", appsForm.getViewType());
            Iterable<Database> list = service.findByType(viewType);
            redirectAttributes.addFlashAttribute("list", list);
            // model.addAttribute("list", list);
            return "redirect:/top#chapter4";
            // return "top";
        }else{
            return "top";
        }

    }
    
}
