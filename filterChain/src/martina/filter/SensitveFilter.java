package martina.filter;

public class SensitveFilter implements  MyFilter {
    @Override
    public void doFilter(Request request, Response response) {
        request.setRequestStr(request.getRequestStr().replace("敏感","**")+"_____SensitiveFilter_____");
        String b="_____SensitiveFilter_____";

    }
}
