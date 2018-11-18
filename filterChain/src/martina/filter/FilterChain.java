package martina.filter;


import java.util.ArrayList;
import java.util.List;

public class FilterChain implements MyFilter {
    List<MyFilter> filterList=new ArrayList<MyFilter>();

    public FilterChain addFilter(MyFilter f){
        this.filterList.add(f);
        return this;
    }
    @Override
    public void doFilter(Request request, Response response) {
        for(MyFilter f:filterList){
            f.doFilter(request,response);
        }
    }
}
