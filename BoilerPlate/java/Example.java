//index or contact
@JXW(index.html)
public class ExamplePage extends HtmlPage implements HtmlPage{

    //
    public Example(){}


    /*===================================
     *          3 different idea
     *  1. annotation
     *  2. to try at first
     *  3. doxygen auto generating like
     *
     ====================================*/

    // Component definition1
    @JX("myBtn")
    @Class("bootstrap")
    public JXButton renderComp(){}

    // Component definition2
    public JXButton renderComp("myBtn.jx"){}

    // Component definition3
    /**
     * @{identifier}                //for parent binding in comment
     * @text   #{innerHtml}         //?
     * @id     #{id}                //?
     * @class  #[style bootstrap]   //?
     * @event  #[onclick=func onload=func2]
     * @parent identifier           // non opt
     * @return type                 // non opt
     */
    public void renderComp(){}

    /**
     * #{divLayout}
     * @parent [index]
     * @return [div]
     */
    public void renderDivMain(){}

    /**
     * #{divLayout}
     * @text [Ok]
     * @onclick [funcReadInput()]
     * @parent [index]
     * @return [button]
     */
    public void renderBtnClick(){}

    /**
     * #{divLayout}
     * @id  [txtField]
     * @parent [index]
     * @return [input]
     */
    public void renderInput(){}


    // From implement
    @JX
    @Render(name.html)
    public void renderPager(){}



}
