package JXW.Component.Container;

import JXW.Component.Comp;
import JXW.Component.Input.Base.AbstractInput;

public class Form extends Comp {
    public Form()
    {
        super("form", "");
        this.addComponent(addSubmit());
    }

    private Submit addSubmit()
    {
        return new Submit();
    }

    /**
     * Classe interne pour le submit form
     */
    private class Submit extends AbstractInput
    {
        public Submit()
        {
            super("submit");
        }
    }


    /**
     * let params = new URL(document.location).searchParams;
     * let name = params.get("name"); // is the string "Jonathan Smith".
     * let age = parseInt(params.get("age")); // is the number 18
     */

    /**
     * const url = new URL(
     *   "https://developer.mozilla.org/en-US/docs/Web/API/URL/pathname?q=value",
     * );
     * console.log(url.pathname); // Logs "/en-US/docs/Web/API/URL/pathname"
     */

    /**
     * const url = new URL(
     *   "https://developer.mozilla.org/en-US/docs/Web/API/URL/search?q=123",
     * );
     * console.log(url.search); // Logs "?q=123"
     */

    /**
     * const url = new URL(
     *   "https://developer.mozilla.org/en-US/docs/Web/API/URL/href#Examples",
     * );
     * console.log(url.hash); // Logs: '#Examples'
     *
     * let url = new URL("https://example.com?foo=1&bar=2");
     * let params = new URLSearchParams(url.search);
     *
     * //Add a second foo parameter.
     *      params.append("foo", 4);
     * //Query string is now: 'foo=1&bar=2&foo=4'
     */
}
