# JSON Placeholder Posts

## About the project

Scala project using [JSON Placeholder](https://jsonplaceholder.typicode.com/) service. It uses GET request on  https://jsonplaceholder.typicode.com/posts and saves each post locally to `output` folder in the project directory in `<post-id>.json` format.

It uses [Requests-Scala 0.7.1](https://github.com/com-lihaoyi/requests-scala) for making requests.

## Prerequisite
- git
- sbt
- Scala

## Usage
- Clone the repository to your directory with `git clone https://github.com/rafkac/json-placdeholder`
- Run the application with `sbt run` command in the same directory or with the green triangle in Intellij Idea IDE
    * after running application you can see folder `output` filled with data
- Test the application with `sbt test` command or with the green triangle in Intellij Idea IDE