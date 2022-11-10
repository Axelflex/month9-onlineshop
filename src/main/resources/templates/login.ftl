<#import "pattern/common.ftl" as c>
<#import "pattern/login.ftl" as l>

<@c.page>
    Login page
    <@l.login"/login"/>
    <a href="/registration">Добавить пользователя</a>
</@c.page>