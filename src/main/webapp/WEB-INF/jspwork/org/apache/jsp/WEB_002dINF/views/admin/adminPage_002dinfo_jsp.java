/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-17 07:19:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminPage_002dinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1654679473355L));
    _jspx_dependants.put("jar:file:/Users/sohyun_b/workspace/team4/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>관리자 페이지</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/member/myInfo.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"myPage-content\">\n");
      out.write("            \n");
      out.write("            <!-- 왼쪽 사이드 메뉴 -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/admin/admin-sideMenu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section class=\"myPage-main\">\n");
      out.write("                <h2 class=\"title\">\n");
      out.write("                    <span>내 정보</span>\n");
      out.write("                </h2>\n");
      out.write("        \n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("                \n");
      out.write("                <form action=\"info\" method=\"POST\" name=\"myPage-form\" onsubmit=\"return changeInfoValidate()\">\n");
      out.write("                    <table name=\"signUp-form\" class=\"tb\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>아이디</th>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("        \n");
      out.write("                        <tr>\n");
      out.write("                            <th>이름</th>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("        \n");
      out.write("                        <tr>\n");
      out.write("                            <th>닉네임</th>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"memberNickname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"memberNick\" placeholder=\"영어/숫자/한글 2~10글자 사이로 작성해주세요.\">\n");
      out.write("                                <button class=\"member_btn\" id=\"nicknameBtn\" type=\"button\">중복확인</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("        \n");
      out.write("                        <tr>\n");
      out.write("                            <th>전화번호</th>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"tel\" name=\"memberTel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberTel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"memberTel\" maxlength=\"13\" placeholder=\"번호를 입력해 주세요\">\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("        \n");
      out.write("                        <tr>\n");
      out.write("                            <th>이메일</th>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("        \n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("        \n");
      out.write("                    <button id=\"update\">수정하기</button>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("        \n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("            </section>         \n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/member/myInfo.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
