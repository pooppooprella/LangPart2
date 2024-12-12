package org.example.langpart2.controller

//import lombok.RequiredArgsConstructor
//import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

//@Slf4j
@RestController
//@RequiredArgsConstructor
@RequestMapping("/lang")
class MainApiController {

//    @RequestMapping("/")
//    fun langSampleGet(): ModelAndView{
//        println("langSampleGetlangSampleGetlangSampleGet")
//        val mav = ModelAndView()
//        mav.viewName = "main"
//        return mav
//    }

    @RequestMapping("/main")
    fun langSampleGet(): ModelAndView{
        var mav = ModelAndView()
        mav.viewName = "teamwork/langwork"
        return mav
    }
}