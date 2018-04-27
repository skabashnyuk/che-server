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

type Container struct {

	// Docker image name
	Image string `json:"image"`

	// List of environment variables to set in the container. Cannot be updated.
	Env []EnvVar `json:"env,omitempty"`

	// Compute Resources required by this container.
	Resources *ResourceRequirements `json:"resources,omitempty"`

	// List of container commands
	Commands []Command `json:"commands,omitempty"`

	// List of container servers
	Servers []Server `json:"servers,omitempty"`

	// List of container volumes
	Volumes []Volume `json:"volumes,omitempty"`
}
