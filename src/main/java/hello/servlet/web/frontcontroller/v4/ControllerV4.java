package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    /**
     *
     * @param paramMap
     * @param model
     * @return viewname
     */
    // v3와 다르게 서블릿 종속성을 제거했다.
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
