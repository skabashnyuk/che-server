/* 
 * Che Feature API
 *
 * Che Feature API
 *
 * API version: 1.0.0
 * Contact: skabashniuk@redhat.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type ChePlugin struct {

	// Plugin Name
	Name string `json:"name"`

	// Plugin version
	Version string `json:"version"`

	// Plugin title
	Title string `json:"title"`

	// Plugin created time
	CreatedAt string `json:"created_at,omitempty"`

	// Plugin updated time
	UpdatedAt string `json:"updated_at,omitempty"`

	// Plugin installation count
	InstallationCount int32 `json:"installation_count,omitempty"`

	// Plugin description
	Description string `json:"description"`

	Licese *PluginLicense `json:"licese,omitempty"`

	Owner *PluginOwner `json:"owner"`
}
