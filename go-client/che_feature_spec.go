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

type CheFeatureSpec struct {

	Version string `json:"version"`

	Services []CheServiceReference `json:"services"`
}