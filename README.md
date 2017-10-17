# Clojure and Neo4j Integration Example

This is a sample project for demonstrating how to integrate clojure with Neo4j.

## Neo4j installation
This project assumes that neo4j is installed locally and available on ports 7474 and 7687.

### Local installation:
Download a neo4j install from the Neo4j website.

### Docker installation:
If you have Docker installed and want to just run a container you can use the following steps.

#### Start an instance of neo4j
You can start a Neo4j container like this:

```
docker run \
    --publish=7474:7474 --publish=7687:7687 \
    --volume=$HOME/neo4j/data:/data \
    neo4j
```    
which allows you to access neo4j through your browser at http://localhost:7474.

This binds two ports (7474 and 7687) for HTTP and Bolt access to the Neo4j API. A volume is bound to /data to allow the database to be persisted outside the container.

By default, this requires you to login with neo4j/neo4j and change the password. You can, for development purposes, disable authentication by passing --env=NEO4J_AUTH=none to docker run.

## Usage

FIXME: explanation

    $ java -jar clojure-neo4j-0.1.0-standalone.jar [args]



## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
