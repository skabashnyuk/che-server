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

type CheService struct {

	// Kind is a string value representing the REST resource this object represents.
	Kind string `json:"kind"`

	// APIVersion defines the versioned schema of this representation of an object
	ApiVersion string `json:"apiVersion"`

	Metadata *ObjectMeta `json:"metadata"`

	Spec *CheServiceSpec `json:"spec"`
}
