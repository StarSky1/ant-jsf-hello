package com.yj.hello.view;

import javax.el.ValueExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

@ManagedBean(name = "hello")
@RequestScoped
public class HelloBean {
    //用于登录的用户名
    private String userName;
    //用于显示New Friend的文本输出组件
    private HtmlOutputText htmlOutputText;

    //构造函数
    public HelloBean(){

    }

    public String sayHelloAction(){
        if(userName.equalsIgnoreCase("stranger")){
            //获得应用程序实例，以便创建HtmlOutputText 组件
            FacesContext context=FacesContext.getCurrentInstance();
            //声明一个输出文本组件
            HtmlOutputText output=new HtmlOutputText();
            //获得一个值表达式
            ValueExpression value=context.getApplication().getExpressionFactory().
                    createValueExpression(context.getELContext(),"#{hello.htmlOutputText}",String.class);
            output.setValueExpression("value",value);

            //为HtmlOutputText 组件设置值
            output.setValue("New Friend!");
            //为HtmlOutputText 组件设置css风格
            output.setStyle("color:red");
            //将创建的HtmlOutputText组件实例赋给Bean的属性
            this.htmlOutputText=output;
            //返回陌生人访问时的导航逻辑字符串
            return "newFriend";
        }else{
            //返回熟人访问时的导航逻辑字符串
            return "oldFriend";
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HtmlOutputText getHtmlOutputText() {
        return htmlOutputText;
    }

    public void setHtmlOutputText(HtmlOutputText htmlOutputText) {
        this.htmlOutputText = htmlOutputText;
    }
}
