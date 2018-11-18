package filter;

public interface MyFilter {
    void  doFilter(Request request, Response response,FilterChain filterChain);
}
