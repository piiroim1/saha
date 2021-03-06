/**
 * 
 */
package fi.seco.saha3.model.configuration;

/**
 * @author jiemakel
 * 
 */
public interface ISPARQLConfigService {

	public void setConfiguration(String sparqlURL, String sparulURL, String queryGraphURI, String updateGraphURI,
			String referenceGraphURI, String labelURI, String wholeModelQuery, String topStringMatchesQuery,
			String inlineStringMatchesQuery, String instanceQuery, String labelQuery, String typesQuery,
			String propertiesQuery, String inversePropertiesQuery, String editorPropertiesQuery,
			String propertyTreeQuery, String classTreeQuery);

	public String getSparqlURL();

	public String getSparulURL();

	public String getQueryGraphURI();

	public String getUpdateGraphURI();

	public String getReferenceGraphURI();

	public String getWholeModelQuery();

	public String getTopStringMatchesQuery();

	public String getInlineStringMatchesQuery();

	public String getInstanceQuery();

	public String getLabelQuery();

	public String getTypesQuery();

	public String getPropertiesQuery();

	public String getInversePropertiesQuery();

	public String getEditorPropertiesQuery();

	public String getClassTreeQuery();

	public String getPropertyTreeQuery();

	public String getLabelURI();

}
