package martina.filter;


public class HTMLMyFilter implements MyFilter {

    @Override
    public void doFilter(Request request, Response response) {
       //  request.setRequestStr(request.getRequestStr().replace("<","["));
        request.setRequestStr(request.getRequestStr()
                .replace("<>","[]")+"_______HTMLMyFilter_______");

        String a="_______HTMLMyFilter_______";

    }
}
