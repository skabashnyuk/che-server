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

type Command struct {

	Name string `json:"name"`

	WorkingDir string `json:"working-dir"`

	Command []string `json:"command"`
}
