package filter;


public class HTMLMyFilter implements MyFilter {

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
       //  request.setRequestStr(request.getRequestStr().replace("<","["));
        String a="_______HTMLMyFilter_______";
        request.setRequestStr(request.getRequestStr()
                .replace("<>","[]")+a);

        //实现通过response返回原来的值
        filterChain.doFilter(request,response,filterChain);
        response.setResponseStr(response.getResponseStr()+a);
    }
}
