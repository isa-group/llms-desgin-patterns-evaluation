# llms-desgin-patterns-evaluation a.k.a. Do electronic parrots dream design patterns?

This repository contains the scenarios and analysis performed for the JISBD2024 paper by J. A. Parejo (University of Sevilla).
Inside the oodp-scenarios folders you will find three sub-folder one for each type of Object Oriented (OO) design pattern: Creationa, Structural, and Behavioural. Inside of each OO desgin pattern type folder, you find subfolders for each specific pattern. Inside each pattern folder, you will find two scenarios (structured as independent folder). Each scenario is a workinng java-maven project, which contains, the original sources that compose the scenario (inside the src/main/java/original folder), and the classes generated by ChatGPT4 for each independent runs, in the folders src/main/java/run1, and src/main/java/run2 respectively. Additionally each scenario contains one folder named runs, which contains 2 mardkown files, named run1.md and run2.md. Those files contain a log and discussion/analysis of the author for the conversation that constitutes each run of the scenario.

| Pattern Type  | OO Design Pattern | Scenario / Project | Run / Experimental Replication | 
| ------------- | ------------- | ------------- | ------------- |
| [Creational](oodp-scenarios/creational)  | [Builder](oodp-scenarios/creational/builder)  |  [builder-e1](oodp-scenarios/creational/builder/builder-e1)  |  [run1](oodp-scenarios/creational/builder/builder-e1/runs/run1.md) | 
| [Creational](oodp-scenarios/creational)  | [Builder](oodp-scenarios/creational/builder)  |  [builder-e1](oodp-scenarios/creational/builder/builder-e1)  |  [run2](oodp-scenarios/creational/builder/builder-e1/runs/run2.md) | 
| [Creational](oodp-scenarios/creational)  | [Builder](oodp-scenarios/creational/builder)  |  [builder-e2](oodp-scenarios/creational/builder/builder-e2)  |  [run1](oodp-scenarios/creational/builder/builder-e2/runs/run1.md) | 
| [Creational](oodp-scenarios/creational)  | [Builder](oodp-scenarios/creational/builder)  |  [builder-e2](oodp-scenarios/creational/builder/builder-e2)  |  [run2](oodp-scenarios/creational/builder/builder-e2/runs/run2.md) | 
| [Creational](oodp-scenarios/creational)  | [Prototype](oodp-scenarios/creational/prototype)  |  [prototype-e1](oodp-scenarios/creational/prototype/prototype-e1)  |  [run1](oodp-scenarios/creational/prototype/prototype-e1/runs/run1.md) | 
| [Creational](oodp-scenarios/creational)  | [Prototype](oodp-scenarios/creational/prototype)  |  [prototype-e1](oodp-scenarios/creational/prototype/prototype-e1)  |  [run2](oodp-scenarios/creational/prototype/prototype-e1/runs/run2.md) | 
| [Creational](oodp-scenarios/creational)  | [Prototype](oodp-scenarios/creational/prototype)  |  [prototype-e2](oodp-scenarios/creational/prototype/prototype-e2)  |  [run1](oodp-scenarios/creational/prototype/prototype-e2/runs/run1.md) | 
| [Creational](oodp-scenarios/creational)  | [Prototype](oodp-scenarios/creational/prototype)  |  [prototype-2](oodp-scenarios/creational/prototype/prototype-e2)  |  [run2](oodp-scenarios/creational/prototype/prototype-e2/runs/run2.md) |
| [Structural](oodp-scenarios/structural)  | [Adapter](oodp-scenarios/structural/adapter)  |  [adapter-e1](oodp-scenarios/structural/adapter/adapter-e1)  |  [run1](oodp-scenarios/structural/adapter/adapter-e1/runs/run1.md) |
| [Structural](oodp-scenarios/structural)  | [Adapter](oodp-scenarios/structural/adapter)  |  [adapter-e1](oodp-scenarios/structural/adapter/adapter-e1)  |  [run2](oodp-scenarios/structural/adapter/adapter-e1/runs/run2.md) |
| [Structural](oodp-scenarios/structural)  | [Adapter](oodp-scenarios/structural/adapter)  |  [adapter-e2](oodp-scenarios/structural/adapter/adapter-e2)  |  [run1](oodp-scenarios/structural/adapter/adapter-e2/runs/run1.md) |
| [Structural](oodp-scenarios/structural)  | [Adapter](oodp-scenarios/structural/adapter)  |  [adapter-e2](oodp-scenarios/structural/adapter/adapter-e2)  |  [run2](oodp-scenarios/structural/adapter/adapter-e2/runs/run2.md) |
| [Structural](oodp-scenarios/structural)  | [Decorator](oodp-scenarios/structural/decorator)  |  [decorator-e1](oodp-scenarios/structural/decorator/decorator-e1)  |  [run1](oodp-scenarios/structural/decorator/decorator-e1/runs/run1.md) |
| [Structural](oodp-scenarios/structural)  | [Decorator](oodp-scenarios/structural/decorator)  |  [decorator-e1](oodp-scenarios/structural/decorator/decorator-e1)  |  [run2](oodp-scenarios/structural/decorator/decorator-e1/runs/run2.md) |
| [Structural](oodp-scenarios/structural)  | [Decorator](oodp-scenarios/structural/decorator)  |  [decorator-e2](oodp-scenarios/structural/decorator/decorator-e2)  |  [run1](oodp-scenarios/structural/decorator/decorator-e2/runs/run1.md) |
| [Structural](oodp-scenarios/structural)  | [Decorator](oodp-scenarios/structural/decorator)  |  [decorator-e2](oodp-scenarios/structural/decorator/decorator-e2)  |  [run2](oodp-scenarios/structural/decorator/decorator-e2/runs/run2.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Command](oodp-scenarios/behavioural/command)  |  [command-e1](oodp-scenarios/behavioural/command/command-e1)  |  [run1](oodp-scenarios/behavioural/command/command-e1/runs/run1.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Command](oodp-scenarios/behavioural/command)  |  [command-e1](oodp-scenarios/behavioural/command/command-e1)  |  [run2](oodp-scenarios/behavioural/command/command-e1/runs/run2.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Command](oodp-scenarios/behavioural/command)  |  [command-e2](oodp-scenarios/behavioural/command/command-e2)  |  [run1](oodp-scenarios/behavioural/command/command-e1/runs/run1.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Command](oodp-scenarios/behavioural/command)  |  [command-e2](oodp-scenarios/behavioural/command/command-e2)  |  [run2](oodp-scenarios/behavioural/command/command-e1/runs/run2.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Strategy](oodp-scenarios/behavioural/strategy)  |  [strategy-e1](oodp-scenarios/behavioural/strategy/strategy-e1)  |  [run1](oodp-scenarios/behavioural/strategy/strategy-e1/runs/run1.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Strategy](oodp-scenarios/behavioural/strategy)  |  [strategy-e1](oodp-scenarios/behavioural/strategy/strategy-e1)  |  [run2](oodp-scenarios/behavioural/strategy/strategy-e1/runs/run2.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Strategy](oodp-scenarios/behavioural/strategy)  |  [strategy-e2](oodp-scenarios/behavioural/strategy/strategy-e2)  |  [run1](oodp-scenarios/behavioural/strategy/strategy-e2/runs/run1.md) |
| [Behavioral](oodp-scenarios/behavioural)  | [Strategy](oodp-scenarios/behavioural/strategy)  |  [strategy-e2](oodp-scenarios/behavioural/strategy/strategy-e2)  |  [run2](oodp-scenarios/behavioural/strategy/strategy-e2/runs/run2.md) |










