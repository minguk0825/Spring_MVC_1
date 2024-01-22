package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    // v2와 다르게 ModelView를 반환한다.
    ModelView process(Map<String, String> paramMap);
}
