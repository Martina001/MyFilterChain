package filter;

public class SensitveFilter implements MyFilter {
    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        String b="_____SensitiveFilter_____";
        request.setRequestStr(request.getRequestStr().replace("敏感","**")+b);

        filterChain.doFilter(request,response,filterChain);
        response.setResponseStr(response.getResponseStr()+b);
    }
}
