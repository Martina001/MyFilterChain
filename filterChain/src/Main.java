import martina.filter.*;

public class Main {

    public static void main(String[] args) {
        String msg="大家好，这是一个敏感信息<script>";
        Request request=new Request();
        Response response=new Response();
        response.setResponseStr("response");
        request.setRequestStr(msg);
//        MsgProcessor msgProcessor=new MsgProcessor();
        FilterChain filterChain=new FilterChain();
//        msgProcessor.setMsg(msg);
        filterChain.addFilter(new HTMLMyFilter())
                .addFilter(new SensitveFilter());
//        msgProcessor.setFilterChain(filterChain);
        filterChain.doFilter(request,response);
        System.out.println("Hello World!"+request.getRequestStr()+response.getResponseStr());
    }
}
