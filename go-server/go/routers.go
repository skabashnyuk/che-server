package 

import (
	"net/http"
	"fmt"
	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"/skabashniuk/Che/1.0.0/",
		Index,
	},

	Route{
		"AddCheService",
		"POST",
		"/skabashniuk/Che/1.0.0/service",
		AddCheService,
	},

	Route{
		"AddFeature",
		"POST",
		"/skabashniuk/Che/1.0.0/feature",
		AddFeature,
	},

	Route{
		"DeleteFeatureByNameAndVersion",
		"DELETE",
		"/skabashniuk/Che/1.0.0/feature/{name}/{version}",
		DeleteFeatureByNameAndVersion,
	},

	Route{
		"DeletePluginByNameAndVersion",
		"DELETE",
		"/skabashniuk/Che/1.0.0/plugin/{name}/{version}",
		DeletePluginByNameAndVersion,
	},

	Route{
		"DeleteServiceByNameAndVersion",
		"DELETE",
		"/skabashniuk/Che/1.0.0/service/{name}/{version}",
		DeleteServiceByNameAndVersion,
	},

	Route{
		"GetChePlugins",
		"GET",
		"/skabashniuk/Che/1.0.0/plugin",
		GetChePlugins,
	},

	Route{
		"GetPluginByNameAndVersion",
		"GET",
		"/skabashniuk/Che/1.0.0/plugin/{name}/{version}",
		GetPluginByNameAndVersion,
	},

	Route{
		"GetServiceByIdList",
		"GET",
		"/skabashniuk/Che/1.0.0/service",
		GetServiceByIdList,
	},

	Route{
		"GetServiceByNameAndVersion",
		"GET",
		"/skabashniuk/Che/1.0.0/service/{name}/{version}",
		GetServiceByNameAndVersion,
	},

	Route{
		"SearchFeatureByListOfId",
		"GET",
		"/skabashniuk/Che/1.0.0/feature",
		SearchFeatureByListOfId,
	},

	Route{
		"SearchFeatureByNameAndVersion",
		"GET",
		"/skabashniuk/Che/1.0.0/feature/{name}/{version}",
		SearchFeatureByNameAndVersion,
	},

}
