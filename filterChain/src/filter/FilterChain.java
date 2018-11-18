package filter;


import java.util.ArrayList;
import java.util.List;

public class FilterChain implements MyFilter {
    List<MyFilter> filterList=new ArrayList<MyFilter>();
    Integer index=0;
    public FilterChain addFilter(MyFilter f){
        this.filterList.add(f);
        return this;
    }
    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        if(index==filterList.size())
            return;

      MyFilter f=filterList.get(index);
      index++;
      f.doFilter(request,response,filterChain);

    }
}
